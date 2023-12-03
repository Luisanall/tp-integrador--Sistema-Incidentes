package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table (name= "SERVICIO")
@Getter @Setter
public class servicio {
    @Id
    @Column (name= "id_servicio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;
    @Column (name = "descripcion_servicio")
    private String descripcionServicio;
    @OneToMany
    @JoinColumn(name = "servicios_id" , referencedColumnName = "id_servicio")
    private List<servicio> listadeServicios;
    @Column (name = "estado")
    private boolean estadoTecnico;

    public servicio(int idServicio, String descripcionServicio, boolean estadoTecnico){
        this.idServicio = idServicio;
        this.descripcionServicio = descripcionServicio;
        this.estadoTecnico = estadoTecnico;

    }
    public servicio() {
        this.listadeServicios = new ArrayList<servicio>();
    }

}
