package clases;

import lombok.Getter;
import lombok.Setter;

public class tecnico {
        @Setter @Getter
        private int idTenico;
        @Setter @Getter
        private String nombre;
        @Setter @Getter
        private boolean disponibilidad;
        @Setter @Getter
        private int incidentesResueltos;
        @Setter @Getter
        private String mail;
        @Setter @Getter
        private String contacto;
        @Setter @Getter
        private int idEspecialista;
        public tecnico (){
            this.idTenico= idTenico;
            this.nombre = nombre;
            this.disponibilidad =disponibilidad;
            this.incidentesResueltos = incidentesResueltos;
            this.mail=mail;
            this.contacto = contacto;
            this.idEspecialista=idEspecialista;
        }
    }


