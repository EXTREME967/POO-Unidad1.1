/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

import java.util.Scanner;

public class PruebaAlumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Nombre;
        String Carrera;
        int Semestre;
        String NControl;
        float Promedio;

        

        Alumnos a1 = new Alumnos();
        a1.setNombre("");
        a1.setNcontrol("");
        a1.setCarrera("");
        a1.setPromedio(98.3);
        a1.setSemestre(2);
        

        System.out.println(a1.getCarrera() + ", " + a1.getPromedio() + ", " +
                a1.getSemestre() + ", " + a1.getNcontrol() + ", " + a1.getNombre());

    }
}
