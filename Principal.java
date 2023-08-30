import Clases.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    
        //Ingresar alumnos(objeto) en arraylist y carga notas;
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumnos> lista = new ArrayList<>();
        Alumnos chango = new Alumnos();
        int seleccion;
        String nombre;
        int nota1,nota2,nota3;
        String busqueda;


        do {
            poner("Seleccione la opcion deseada");
            poner("1.- Ingresar alumno");
            poner("2.- Leer notas de los alumnos");
            seleccion = sc.nextInt();
            switch(seleccion){
                case 1:
                    poner("Ingrese nombre del alumno");
                    nombre = sc.next();
                    poner("Ingrese la primera nota");
                    nota1 = sc.nextInt();
                    poner("Ingrese la segunda nota");
                    nota2 = sc.nextInt();
                    poner("Ingrese la tercera nota");
                    nota3 = sc.nextInt();
                    lista.add(new Alumnos(nombre,nota1,nota2,nota3));
                    break;
                case 2:
                    poner("Ingrese el nombre del alumno a buscar");
                    busqueda = sc.next();
                    poner(busqueda);
                    for (Alumnos changuito : lista){
                        String auxBusqueda = changuito.getNombre();
                        if (auxBusqueda.equals(busqueda)){
                            poner("************************************" +
                                    "\n Nombre: " + auxBusqueda +
                                    "\n Nota 1: " + changuito.getNota1() +
                                    "\t Nota 2: " + changuito.getNota2() +
                                    "\t Nota 3: " + changuito.getNota3() +
                                    "\n ************************************");
                        }
                    }
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