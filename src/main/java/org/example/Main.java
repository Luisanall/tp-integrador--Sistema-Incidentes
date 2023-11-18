package org.example;

import clases.tecnico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // metodo para que rrhh realice altas, bajas y/o modificaciones. No es el definitivo, la idea es hacerlo mas corto y legible
        ArrayList<tecnico> tecnicos = new ArrayList <tecnico>();
        Scanner lector = new Scanner ( System.in );
        boolean programaActivo = true;
        do {

            System.out.println ( "¿Qué operación quieres realizar?" );
            System.out.println ( "1 - Alta" );
            System.out.println ( "2 - Baja " );
            System.out.println ( "3 - Modificaciones" );
            System.out.println ( "4 - Consultar" );
            System.out.println ( "5 - Finalizar" );
            int opcion = lector.nextInt ();
            if(opcion == 1){
                System.out.println ("Id");
                int idtecnico = lector.nextInt ();
                System.out.println ("Nombre");
                String nombre = lector.next ();
                System.out.println ("Disponibilidad");
                boolean disponibilidad = lector.nextBoolean ();
                System.out.println ("Cantidad de incidentes resueltos");
                int incidentesResueltos = lector.nextInt ();
                System.out.println ("Mail");
                String mail = lector.next ();
                System.out.println ("Contacto");
                String contacto = lector.next ();
                System.out.println ("id Especialista");
                int idEspecialista = lector.nextInt ();
                String alta = lector.next ();
                tecnico tecni = new tecnico ( 1, "Mario", true,5,"mariomartine@gmail.com","3576012",3 );
                tecnicos.add ( tecni );
                System.out.println (tecni);

            } else if (opcion ==2) {
                System.out.println ("Ingrese el nombre del técnico que desea dar de baja");
                String nombre = lector.next ();
                Iterator<tecnico> it =tecnicos.iterator ();
                while (it.hasNext ()){
                    tecnico tecni= it.next ();
                    if(tecni.getNombre ().equals ( nombre )){
                        it.remove ();
                    }
                }

            } else if (opcion == 3){

            } else if (opcion == 4){
                for(tecnico tecni : tecnicos){
                    System.out.println ("Los datos son:  " + tecni.getIdTenico ()+ " "+ tecni.getNombre () + " "+ tecni.isDisponibilidad ()+" "+ tecni.getIncidentesResueltos () + " "  + tecni.getMail () +" "+ tecni.getContacto ()+ " "+ tecni.getIdEspecialista ());
                }

            } else if (opcion == 5){
                programaActivo= false;

            }else{
                System.out.println ("No haz elejido correctamente");
            }
        }while (programaActivo);

    }
}
