package clases;

import lombok.Getter;
import lombok.Setter;

public class rrhh {
    @Setter
    @Getter
    private int id;
    @Setter @Getter
    private int tecnico_id;
    @Setter @Getter
    private int incidente_id;
    @Setter @Getter
    private boolean estado_incidente;

    public rrhh(int id, int tecnico_id, int incidente_id, boolean estado_incidente){
        this.id= id;
        this.tecnico_id= tecnico_id;
        this.incidente_id= incidente_id;
        this.estado_incidente= estado_incidente;

    }
}
