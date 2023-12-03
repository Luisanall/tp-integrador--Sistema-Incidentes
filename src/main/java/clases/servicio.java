package clases;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class servicio {

    private int idServicio;
    private String descripcionServicio;
    private boolean estadoTecnico;

    public servicio(int idServicio, String descripcionServicio, boolean estadoTecnico){
        this.idServicio = idServicio;
        this.descripcionServicio = descripcionServicio;
        this.estadoTecnico = estadoTecnico;

    }

}
