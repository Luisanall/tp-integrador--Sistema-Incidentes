package org.example;

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
        public tecnico (int idTenico, String nombre, boolean disponibilidad, int incidentesResueltos, String mail, String contacto,int idEspecialista ){
            this.idTenico= idTenico;
            this.nombre = nombre;
            this.disponibilidad =disponibilidad;
            this.incidentesResueltos = incidentesResueltos;
            this.mail=mail;
            this.contacto = contacto;
            this.idEspecialista=idEspecialista;
        }
    }

