package clases;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class especialista {

    private int id_Especils;

    private String descripcionEspecialista;
    public  especialista (int id_Especils, String descripcionEspecialista){
        this.id_Especils = id_Especils;
        this.descripcionEspecialista = descripcionEspecialista;
    }
}
