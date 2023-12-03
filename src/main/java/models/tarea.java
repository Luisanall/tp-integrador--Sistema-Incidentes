package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "TAREA")

@Getter @Setter
public class tarea {
    @Id
    @Column(name= "id_tarea")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tarea;
    @Column
    private String nombretarea;
}
