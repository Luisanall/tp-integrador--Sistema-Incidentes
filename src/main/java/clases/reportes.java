package clases;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;

public class reportes {
    @Getter
    @Setter
    private int id_reportes;
    @Getter @Setter
    private String descripcion_incidentes;
    @Getter @Setter
    private Calendar tiempo_estimado;
    @Getter @Setter
    private Calendar tiempo_total;
    public reportes(int id_reportes, String descripcion_incidentes,Calendar tiempo_estimado,Calendar tiempo_total){
        this.id_reportes= id_reportes;
        this.descripcion_incidentes = descripcion_incidentes;
        this.tiempo_estimado = tiempo_estimado;
        this.tiempo_total = tiempo_total;
    }
}
