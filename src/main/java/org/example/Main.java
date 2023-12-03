package org.example;

import clases.incidentes;
import clases.tecnico;
import metodos.areaRRHH;
import metodos.asignarIncidentes;

import java.util.*;


public class Main {
    public static void main(String[] args) {
     //alta, baja y7o modificacion de tecnico
        areaRRHH sistema = new areaRRHH ();
        asignarIncidentes asignacion = new asignarIncidentes ();
        Scanner lector = new Scanner(System.in);

        while (true) {
            System.out.println ( "¿Qué operación desea realizar?" );
            System.out.println ( "1 - Alta de técnico" );
            System.out.println ( "2 - Baja de técnico" );
            System.out.println ( "3 - Consultar técnicos" );
            System.out.println ( "4 - Salir" );

            int opcion = lector.nextInt ();

            switch (opcion) {
                case 1:
                    sistema.altaTecnico ();
                    break;
                case 2:
                    sistema.bajaTecnico ();
                    break;
                case 3:
                    sistema.consultarTecnicos ();
                    break;
                case 4:
                    return;
                default:
                    System.out.println ( "Opción no válida" );
            }
            System.out.println("Ingrese la descripción del incidente: ");
            String descripcion = lector.nextLine();
            incidentes incidente = new incidentes (descripcion);

            // Obtenemos las especialidades del incidente
            System.out.println("Ingrese las especialidades del incidente: ");
            String especialidades = lector.nextLine();
            /*incidente.getTipoIncidentes (especialidades);

            // Obtenemos la lista de técnicos disponibles
            List<tecnico> tecnicosDisponibles = asignarIncidentes.gettecnicosDisponibles(incidente.getDescripcionIncidentes ());

            // Asignamos el incidente al técnico disponible
            asignarIncidentes.asignarIncidentes(incidente, tecnicosDisponibles.get(0));

            // Imprimimos la información del incidente
            System.out.println("El incidente fue asignado al técnico: " + tecnico.getTipoIncidentes ().getNombre());
        }
*/

        }
    }

}

