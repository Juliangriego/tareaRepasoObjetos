import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    
        //Ingresar alumnos(objeto) en arraylist y carga notas;
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumnos> lista = new ArrayList<>();
        Alumnos chango = new Alumnos();
        int seleccion = 0;
        String nombre;
        int nota;

        do {
            poner("Seleccione la opcion deseada");
            poner("1.- Ingresar alumno");
            poner("2.- Leer alumnos");
            switch(seleccion){
                case 1:
                    poner("Ingrese nombre del alumno");
                    nombre = sc.next();
                    break;
                case 2:
                    break;
                default:
                    break;
            }

        } while (seleccion<3);
    
    }

    public static void poner(String pum){
        System.out.println(pum);
    }
}