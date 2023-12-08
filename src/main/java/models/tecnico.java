package clases;

import lombok.Getter;
import lombok.Setter;

public class tecnico {
        @Setter @Getter
        int idTenico;
        @Setter @Getter
        String nombre;
        @Setter @Getter
        boolean disponibilidad;
        @Setter @Getter
        int incidentesResueltos;
        @Setter @Getter
        String mail;
        @Setter @Getter
        String contacto;
        @Setter @Getter
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
    }


