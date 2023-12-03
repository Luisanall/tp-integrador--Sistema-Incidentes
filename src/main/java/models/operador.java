package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
 @Entity
 @Table(name= "OPERADOR")
@Getter @Setter
public class operador {
    @Id
    @Column(name= "idOperador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOperador;

    @OneToMany
    @JoinColumn(name = "operador_id" , referencedColumnName = "idOperador")
    private List<servicio> listadeServicios;
    @Column


    private Calendar tiempoEstimado;

    public operador(int idOperador, Calendar tiempoEstimado) {
        this.idOperador = idOperador;
        this.tiempoEstimado = tiempoEstimado;
    }

    public operador() {
        this.listadeServicios = new ArrayList<servicio> ();
    }
}