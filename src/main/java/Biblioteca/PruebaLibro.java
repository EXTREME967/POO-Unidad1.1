/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;


public class PruebaLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.MostrarDatos();
        
        Libro l2 = new Libro("POO", "Lopez", 1213, "QA125", "Santillana", 325);
        l2.MostrarDatos();
    }
}
