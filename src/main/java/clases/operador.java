package clases;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Getter @Setter
public class operador {
    private List<servicio> listadeServicios;

    private int idOperador;
    private Calendar tiempoEstimado;

    public operador(int idOperador, Calendar tiempoEstimado) {
        this.idOperador = idOperador;
        this.tiempoEstimado = tiempoEstimado;
    }

    public operador() {
        this.listadeServicios = new ArrayList<servicio> ();
    }
}