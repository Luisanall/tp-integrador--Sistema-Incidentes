package metodos;

import clases.tecnico;
import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class areaRRHH {
    @Getter @Setter
    private List<tecnico> listaTecnicos;

    public void rrhh() {
        this.listaTecnicos = new ArrayList<> ();
    }

    public void altaTecnico() {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el id del técnico: ");
        int idTecnico = lector.nextInt();

        System.out.println("Ingrese el nombre del técnico: ");
        String nombre = lector.next();

        System.out.println("Ingrese la disponibilidad del técnico: ");
        boolean disponibilidad = lector.nextBoolean();

        System.out.println("Ingrese la cantidad de incidentes resueltos por el técnico: ");
        int incidentesResueltos = lector.nextInt();

        System.out.println("Ingrese el correo electrónico del técnico: ");
        String mail = lector.next();

        System.out.println("Ingrese el teléfono del técnico: ");
        String contacto = lector.next();

        System.out.println("Ingrese el id del especialista del técnico: ");
        int idEspecialista = lector.nextInt();

        tecnico tecnico = new tecnico(idTecnico, nombre, disponibilidad, incidentesResueltos, mail, contacto, idEspecialista);
        listaTecnicos.add(tecnico);
    }

    public void bajaTecnico() {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre del técnico que desea dar de baja: ");
        String nombre = lector.next();

        for (tecnico tecnico : listaTecnicos) {
            if (tecnico.getNombre().equals(nombre)) {
                listaTecnicos.remove(tecnico);
                break;
            }
        }
    }

    public void consultarTecnicos() {
        for (tecnico tecnico : listaTecnicos) {
            System.out.println(tecnico);
        }
    }

}
