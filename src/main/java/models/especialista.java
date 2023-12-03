package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "ESPECIALISTA")
@Getter @Setter
public class especialista {
    @Id
    @Column(name= "id_especials")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Especils;
    @Column
    private String descripcionEspecialista;
    public  especialista (int id_Especils, String descripcionEspecialista){
        this.id_Especils = id_Especils;
        this.descripcionEspecialista = descripcionEspecialista;
    }
}
