package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Table(name= "INCIDENTE")
@Getter @Setter
public class incidentes {
    @Id
    @Column (name= "id_incidente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidentes;

    @OneToMany
    @JoinColumn(name = "incidentes_id" , referencedColumnName = "id_incidente")
    private List<tarea> tareas;
    @Column
    private String tipoIncidentes;
    @Column
    private String descripcionIncidentes;
    @Column
    private boolean estadoIncidentes;
    @Column
    private Date fecha_inicio;
    @Column
    private Date fecha_fin;
    public incidentes (int idIncidentes,String tipoIncidentes, String descripcionIncidentes, boolean estadoIncidentes, Date fecha_inicio,Date fecha_fin){
        this.idIncidentes = idIncidentes;
        this.tipoIncidentes = tipoIncidentes;
        this.descripcionIncidentes = descripcionIncidentes;
        this.estadoIncidentes = estadoIncidentes;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
    public  incidentes (){
        this.tareas = new ArrayList<tarea> ();

    }
    public incidentes (String descripcionIncidentes){
        this.descripcionIncidentes = descripcionIncidentes;
    }
    public incidentes (int idIncidentes, String tipoIncidentes){
        this.idIncidentes = idIncidentes;
        this.tipoIncidentes= tipoIncidentes;
    }


}
