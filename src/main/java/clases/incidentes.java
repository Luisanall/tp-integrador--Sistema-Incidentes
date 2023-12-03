package clases;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Getter @Setter
public class incidentes {

    private List<tarea> tareas;

    private int idIncidentes;

    private String tipoIncidentes;

    private String descripcionIncidentes;

    private boolean estadoIncidentes;

    private Date fecha_inicio;

    private Date fecha_fin;
    public incidentes (int idIncidentes,String tipoIncidentes, String descripcionIncidentes, boolean estadoIncidentes, Date fecha_inicio,Date fecha_fin){
        this.idIncidentes = idIncidentes;
        this.tipoIncidentes = tipoIncidentes;
        this.descripcionIncidentes = descripcionIncidentes;
        this.estadoIncidentes = estadoIncidentes;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }
    public  incidentes (){
        this.tareas = new ArrayList<tarea> ();

    }
    public incidentes (String descripcionIncidentes){
        this.descripcionIncidentes = descripcionIncidentes;
    }
    public incidentes (int idIncidentes, String tipoIncidentes){
        this.idIncidentes = idIncidentes;
        this.tipoIncidentes= tipoIncidentes;
    }


}
