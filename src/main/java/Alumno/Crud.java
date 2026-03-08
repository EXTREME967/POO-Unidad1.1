/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

import java.util.Scanner;


public class Crud {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte opc;
        Alumnos listaAlum[];

        System.out.println("Cuantos alumnos ingresara?: ");
        int n = sc.nextInt();

        listaAlum = new Alumnos[n];
        System.out.println("INGRESAR DATOS");
        int o = 0;
        do {
            if (o == 0) {
                o++;
                for (int i = 0; i < n; i++) {
                    listaAlum[i] = new Alumnos();
                    sc.nextLine();
                    System.out.println("Ingresa los datos requeridos: ");
                    System.out.print("Nombre: ");
                    listaAlum[i].setNombre(sc.nextLine());
                    System.out.print("Carrera: ");
                    listaAlum[i].setCarrera(sc.nextLine());
                    System.out.print("Semestre: ");
                    listaAlum[i].setSemestre(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Numero de control: ");
                    listaAlum[i].setNcontrol(sc.nextLine());
                    System.out.print("Promedio: ");
                    listaAlum[i].setPromedio(sc.nextDouble());
                }
            }

           
            System.out.println("\nMENU: ");
            System.out.println("1. Consulta general");
            System.out.println("2. Consulta Individual");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Generar Correo");
            System.out.println("6. Salir");
            opc = sc.nextByte();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Consulta General: ");
                    for (int j = 0; j < n; j++) {
                        System.out.print(j+1 + ".- ");
                        listaAlum[j].mostrarDatosGen();
                    }
                    break;
                case 2:
                    System.out.println("Consulta Individual: ");
                    System.out.println("Ingrese el Numero de control del alumno que desea consultar: ");
                    String ncBusqueda = sc.nextLine();
                    Alumnos b1 = new Alumnos();
                    int p = b1.posicion(listaAlum, ncBusqueda);
                    listaAlum[p].mostrarDatosInd();
                    
                    break;
                case 3:
                    System.out.println("Modificar: ");
                    break;
                case 5:
                    System.out.println("Se genero el correo");
                    for (int x = 0; x < n; x++) {
                        Metodo1 e1 = new Metodo1();
                        listaAlum[x].setCorreoTec(e1.Tecnm(listaAlum[x].getNombre(), listaAlum[x].getNcontrol()));
                        listaAlum[x].setCorreoIT(e1.itiguala(listaAlum[x].getNombre(), listaAlum[x].getNcontrol()));
                    }
                    break;

                case 6:
                    System.out.println("Adios :D");
                    break;
                default:
                    break;
            }
        } while (opc != 6);
    }
}
