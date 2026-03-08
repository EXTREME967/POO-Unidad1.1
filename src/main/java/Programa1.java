

import java.util.Scanner;
public class Programa1 {
    
    
    public static void main(String[] args){    
        
        String Nombre;
        String Carrera;
        int Semestre;
        String NControl;
        float Promedio;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESAR DATOS");
        System.out.println("Ingrese los datos requeridos");
        System.out.print("Nombre: ");
        Nombre = sc.nextLine();
        System.out.print("Carrera: ");
        Carrera = sc.nextLine();
        System.out.print("Semestre: ");
        Semestre = sc.nextInt();
        sc.nextLine();
        System.out.print("Numero de control: ");
        NControl = sc.nextLine();
        System.out.print("Promedio: ");
        Promedio = sc.nextFloat();
        
        System.out.println("//////////////////////");
        System.out.println(" MOSTRAR DATOS ");
        System.out.println("Nombre: " + Nombre);
        System.out.println("Carrera: " + Carrera);
        System.out.println("Semestre: " + Semestre);
        System.out.println("Numero de Control: " + NControl);
        System.out.println("Promedio: " + Promedio);
    }    
}
