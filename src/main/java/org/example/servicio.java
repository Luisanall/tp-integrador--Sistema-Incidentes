package org.example;

import lombok.Getter;
import lombok.Setter;

public class servicio {
    @Getter
    @Setter
    private int idServicio;
    @Getter @Setter
    private String descripcionServicio;
    @Getter @Setter
    private boolean estadoTecnico;
    public servicio(int idServicio, String descripcionServicio, boolean estadoTecnico){
        this.idServicio = idServicio;
        this.descripcionServicio = descripcionServicio;
        this.estadoTecnico = estadoTecnico;

    }

}
