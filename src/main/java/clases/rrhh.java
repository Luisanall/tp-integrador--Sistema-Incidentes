package clases;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class rrhh {

    private int id;
    private int tecnico_id;
    private int incidente_id;
    private boolean estado_incidente;


    public rrhh(int id, int tecnico_id, int incidente_id, boolean estado_incidente){
        this.id= id;
        this.tecnico_id= tecnico_id;
        this.incidente_id= incidente_id;
        this.estado_incidente= estado_incidente;

    }
}
