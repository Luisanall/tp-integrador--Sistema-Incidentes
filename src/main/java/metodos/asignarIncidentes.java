package metodos;

import clases.incidentes;
import clases.tecnico;
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
            List<String> tipoIncidente = Collections.singletonList ( incidente.getTipoIncidentes () );

            // Obtenemos la lista de técnicos disponibles para resolver el incidente
            List<tecnico> tecnicosDisponibles = gettecnicosDisponibles(tipoIncidente.get ( 0 ));

            // Si hay técnicos disponibles, asignamos el incidente al primero de la lista
            if (tecnicosDisponibles != null && !tecnicosDisponibles.isEmpty()) {
                incidente.setTipoIncidentes ("Se asignó con éxito el incidente a  "+ tecnicosDisponibles.get ( 0 ));
            }
        }
    }

    public List<tecnico> gettecnicosDisponibles( int tipoIncidente) {
        Scanner lector = new Scanner ( System.in);


        // Obtenemos los técnicos disponibles de la base de datos
        List<tecnico> tecnicosDisponibles = gettecnicosDisponibles(tipoIncidente);

        // Filtramos los técnicos que no tienen las especialidades del incidente
       // tecnicosDisponibles.removeIf(tecnico -> !tecnico.setIdEspecialista ( ));

        return tecnicosDisponibles;
    }

    public void registrarIncidente(incidentes incidente) {
        listaIncidentes.add(incidente);
    }
}
