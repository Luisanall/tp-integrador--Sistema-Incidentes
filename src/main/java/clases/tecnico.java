package clases;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class tecnico {
    private List<servicio> listadeServicios;

        int idTenico;
        String nombre;
        boolean disponibilidad;
        int incidentesResueltos;
        String mail;
        String contacto;
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
        this.listadeServicios = new ArrayList<servicio> ();
    }
    }


