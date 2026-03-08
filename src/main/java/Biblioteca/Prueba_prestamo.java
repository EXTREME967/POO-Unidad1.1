/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
import java.util.Scanner;


public class Prueba_prestamo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String NoPrestamo;
        String ISBN;
        String NoControl;
        String Fecha_Prestamo;
        String Fecha_Entrega;
        
        
        System.out.println("INGRESAR DATOS");
        System.out.println("Ingrese los datos requeridos");
        System.out.print("No. Prestamo: ");
        NoPrestamo = sc.nextLine();
        System.out.print("ISBN: ");
        ISBN = sc.nextLine();
        System.out.print("No. Control: ");
        NoControl = sc.nextLine();
        sc.nextLine();
        System.out.print("Fecha de Prestamo: ");
        Fecha_Prestamo = sc.nextLine();
        System.out.print("Fecha de Entrega: ");
        Fecha_Entrega = sc.nextLine();
        
        
        Prestamo P1 = new Prestamo();
        P1.MostrarDatos();
        
        Prestamo P2 = new Prestamo("219900", "28899901", "29999999", "100000", "100000");
        P2.MostrarDatos();
        
        Prestamo P3 = new Prestamo(NoPrestamo,ISBN,NoControl,Fecha_Prestamo,Fecha_Entrega);
        P3.MostrarDatos();
        
    }    
}
