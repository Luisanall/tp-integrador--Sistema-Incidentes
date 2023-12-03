package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name= "TECNICO")
@Setter @Getter
public class tecnico {
        @Id
        @Column(name= "id_tecnico")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int idTenico;
        @OneToMany
        @JoinColumn(name = "tecnico_id" , referencedColumnName = "id_tecnico")
        private List<incidentes> listadeIncidentes;
        @Column
        String nombre;
        @Column
        boolean disponibilidad;
        @Column
        int incidentesResueltos;
        @Column
        String mail;
        @Column
        String contacto;
        @Column
        int idEspecialista;

        public tecnico (int idTenico, String nombre, boolean disponibilidad, int incidentesResueltos, String mail, String contacto , int idEspecialista){
            this.idTenico= idTenico;
            this.nombre = nombre;
            this.disponibilidad =disponibilidad;
            this.incidentesResueltos = incidentesResueltos;
            this.mail=mail;
            this.contacto = contacto;
            this.idEspecialista= idEspecialista;
        }
        public tecnico() {
            this.listadeIncidentes = new ArrayList<incidentes>();

    }
    }


