/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

public class Alumnos {

    String Nombre;
    String Carrera;
    int Semestre;
    double Promedio;
    String Ncontrol;
    String CorreoTec;
    String CorreoIT;
    

    public Alumnos() {
        this.Nombre = "";
        this.Carrera = "";
        this.Semestre = 0;
        this.Promedio = 0;
        this.Ncontrol = "";
        this.CorreoTec = "";
        this.CorreoIT = "";
    }

    public Alumnos(String Nom, String Carr, int Sem, double Prom, String No, String CorrTec, String CorrIT) {
        this.Nombre = Nom;
        this.Carrera = Carr;
        this.Semestre = Sem;
        this.Promedio = Prom;
        this.Ncontrol = No;
        this.CorreoTec = CorrTec;
        this.CorreoIT = CorrIT;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    public void setNcontrol(String Ncontrol) {
        this.Ncontrol = Ncontrol;
    }

    public void setCorreoTec(String CorreoTec) {
        this.CorreoTec = CorreoTec;
    }

    public void setCorreoIT(String CorreoIT) {
        this.CorreoIT = CorreoIT;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getCarrera() {
        return this.Carrera;
    }

    public int getSemestre() {
        return this.Semestre;
    }

    public double getPromedio() {
        return this.Promedio;
    }

    public String getNcontrol() {
        return this.Ncontrol;
    }
    
    public int posicion(Alumnos lista[], String Nc){
        int b = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].Ncontrol.equals(Nc)) {
                b = 1;
                return i;
            }
        }
        return b;
    }
    
    public void mostrarDatosGen() {
        System.out.println(this.Nombre + ", " + this.Carrera + ", " + this.Ncontrol
                        + ", " + this.Semestre + ", " + this.Promedio + ", "
                        + this.CorreoTec + ", " + this.CorreoIT);
        }
    public void mostrarDatosInd() {
        System.out.println("\n***********************");
        System.out.println("CONSULTA POR ALUMNO");
        System.out.println("DATOS DEL ALUMNO");
        System.out.println(
                "Nombre: " + this.Nombre + "\nCarrera: " + this.Carrera + "\nNumero de Control: " + this.Ncontrol
                        + "\nSemestre: " + this.Semestre + "\nPromedio: " + this.Promedio + "\nCorreo TecNM: " + this.CorreoTec + "\nCorreo ITiguala: " + this.CorreoIT);
        System.out.println("*************************");
    }
}
