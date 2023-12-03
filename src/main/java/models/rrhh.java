package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "RRHH")
@Setter @Getter
public class rrhh {
    @Id
    @Column(name= "id_rrhh")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_RRHH;
    @Column
    private int tecnico_id;
    @Column
    private int incidente_id;
    @Column
    private boolean estado_incidente;


    public rrhh(int id, int tecnico_id, int incidente_id, boolean estado_incidente){
        this.id_RRHH= id;
        this.tecnico_id= tecnico_id;
        this.incidente_id= incidente_id;
        this.estado_incidente= estado_incidente;

    }
}
