package clases;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class incidentes {
    @Getter
    @Setter
    private int idIncidentes;
    @Getter @Setter
    private String tipoIncidentes;
    @Getter @Setter
    private String descripcionIncidentes;
    @Getter @Setter
    private boolean estadoIncidentes;
    @Getter @Setter
    private Date fecha_inicio;
    @Getter @Setter
    private Date fecha_fin;
    public incidentes (int idIncidentes,String tipoIncidentes, String descripcionIncidentes, boolean estadoIncidentes, Date fecha_inicio,Date fecha_fin){
        this.idIncidentes = idIncidentes;
        this.tipoIncidentes = tipoIncidentes;
        this.descripcionIncidentes = descripcionIncidentes;
        this.estadoIncidentes = estadoIncidentes;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
}
