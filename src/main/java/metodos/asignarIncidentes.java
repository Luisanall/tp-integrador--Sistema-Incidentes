package metodos;

import models.incidentes;
import models.tecnico;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class asignarIncidentes {
    @Getter @Setter
    private List<tecnico> listatecnico;
    @Getter @Setter
    private List<incidentes> listaIncidentes;
    public asignarIncidentes() {
        this.listatecnico = new ArrayList<> ();
        this.listaIncidentes = new ArrayList<> ();
    }

    public void asignarIncidentes() {

        for (incidentes incidente : listaIncidentes) {

            // Obtenemos el tipo de incidente
            List<String> tipoIncidente = Collections.singletonList(incidente.getTipoIncidentes());

            // Obtenemos la lista de técnicos disponibles para resolver el incidente


        }

    }
}
