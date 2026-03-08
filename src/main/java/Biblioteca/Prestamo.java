/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;



public class Prestamo {
    private String NoPrestamo;
    public String ISBN;
    public String NoControl;
    public String Fecha_Prestamo;
    public String Fecha_Entrega;
    
    public Prestamo() {
        this.NoPrestamo="";
        this.ISBN="";
        this.NoControl="";
        this.Fecha_Prestamo="";
        this.Fecha_Entrega="";
    }

    public Prestamo(String NoPrestamo, String ISBN, String NoControl, String Fecha_Prestamo, String Fecha_Entrega) {
        this.NoPrestamo = NoPrestamo;
        this.ISBN = ISBN;
        this.NoControl = NoControl;
        this.Fecha_Prestamo = Fecha_Prestamo;
        this.Fecha_Entrega = Fecha_Entrega;
    }
    
    public void MostrarDatos(){
        
        System.out.println("\n***********************");
        System.out.println("Datos del Objeto");
        System.out.println("No. Prestamo: " + this.NoPrestamo);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("No.Control: " + this.NoControl);
        System.out.println("Fecha de Prestamo: " + this.Fecha_Prestamo);
        System.out.println("Fecha de Entrega: " + this.Fecha_Entrega);
        System.out.println("\n***********************");
    } 
}
    



