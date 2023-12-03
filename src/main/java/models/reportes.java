package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
@Entity
@Table(name= "REPORTES")
@Getter @Setter
public class reportes {
    @Id
    @Column(name= "id_reportes")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reportes;
    @Column
    private String descripcion_incidentes;
    @Column
    private Calendar tiempo_estimado;
    @Column
    private Calendar tiempo_total;
    public reportes(int id_reportes, String descripcion_incidentes,Calendar tiempo_estimado,Calendar tiempo_total){
        this.id_reportes= id_reportes;
        this.descripcion_incidentes = descripcion_incidentes;
        this.tiempo_estimado = tiempo_estimado;
        this.tiempo_total = tiempo_total;
    }
}
