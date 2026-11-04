package progra2byron;

import java.util.Scanner;

public class Practica {

    
    static String nombre = "";
    static String apellido = "";
    static String cedula = "";
    static String servicio = "";
    static int numeroTurno = 0;
    static int cubiculoOcupado = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE TURNOS ---");

        ingresarDatosU();

        System.out.print("Ingrese el servicio deseado: ");
        String serv = scanner.nextLine();
        generarServicio(serv);

        System.out.print("Ingrese el número de cubículo asignado: ");
        int cubiculo = scanner.nextInt();
        asignaCubiculo(cubiculo);
    }


    public static void ingresarDatosU() {
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        apellido = scanner.nextLine();

        System.out.print("Ingrese la cédula: ");
        cedula = scanner.nextLine();
    }

    public static void generarServicio(String pServicio) {
        servicio = pServicio;
        numeroTurno++; 
    }

    public static void imprimirInfo() {
        System.out.println("\n----------------------------------");
        System.out.println("       INFORMACIÓN DEL TURNO      ");
        System.out.println("----------------------------------");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Cédula: " + cedula);
        System.out.println("Servicio: " + servicio);
        System.out.println("Nº de Turno Asignado: " + numeroTurno);
    }

    public static void asignaCubiculo(int pCubiculo) {
        cubiculoOcupado = pCubiculo;
        
        imprimirInfo(); 
        System.out.println("Cubículo Asignado: " + cubiculoOcupado);
        System.out.println("----------------------------------");
    }
}