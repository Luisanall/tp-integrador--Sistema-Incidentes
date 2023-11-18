package clases;

import lombok.Getter;
import lombok.Setter;

public class especialista {
    @Getter
    @Setter
    private int id_Especils;
    @Getter @Setter
    private String descripcionEspecialista;
    public  especialista (int id_Especils, String descripcionEspecialista){
        this.id_Especils = id_Especils;
        this.descripcionEspecialista = descripcionEspecialista;
    }
}
