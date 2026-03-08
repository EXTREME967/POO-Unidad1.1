/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodospoo;

/**
 *
 * @author erdam
 */
public class Pruebamismetodos {
    public static void main(String[] args) {
        Mismetodos s1 = new Mismetodos();        
        System.out.println("Primer metodo: " );
        s1.suma(32, 56);
        int r1 = s1.suma1(20, 19);
        System.out.println("Segundo metodo: " + r1);
        double r3 = s1.suma(291.4, 299.1);
        System.out.println("Metodo double: " + r3);
        int r2 = s1.suma(10, 20, 30);
        System.out.println("Tercer metodo: " + r2);
    }  
}
