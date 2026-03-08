package Alumno;

public class Metodo1 {
    private String nombre;
    private String numeroControl;
    private String correoTecnm;
    private String correoItiguala;

    public String itiguala(String nombre, String numeroControl) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        
        String[] nombreSeparado = nombre.split(" ");
        int posApellidoPaterno = nombreSeparado.length - 2;
        String num4 = numeroControl.substring(0, 4);
        String num2 = numeroControl.substring(6, 8);
        this.correoTecnm = nombreSeparado[posApellidoPaterno] + "_" + num4 + "_" + num2 + "@iguala.tecnm.mx";
        int posApellidoMaterno = nombreSeparado.length - 1;
        this.correoItiguala = nombreSeparado[posApellidoMaterno] + "_" + num4 + "_" + num2 + "@itiguala.mx";
        return this.correoItiguala;
    }
    
    public String Tecnm(String nombre, String numeroControl) {
        this.nombre = nombre;
        this.numeroControl = numeroControl;
        String[] nombreSeparado = nombre.split(" ");
        int posApellidoPaterno = nombreSeparado.length - 2;
        String num4 = numeroControl.substring(0, 4);
        String num2 = numeroControl.substring(6, 8);
        this.correoTecnm = nombreSeparado[posApellidoPaterno] + "_" + num4 + "_" + num2 + "@iguala.tecnm.mx";
        return this.correoTecnm;
    }
    
    
    

    public void mostrarCorreos() {
        System.out.println("\n\n///////////////////////////////////////////////////////");
        System.out.println("Hola, " + this.nombre + "\nSu numero de control es: " + this.numeroControl);
        System.out.println("Su correo (TecNM) asignado es: " + this.correoTecnm);
        System.out.println("Su correo (Itiguala) asignado es: " + this.correoItiguala);
        System.out.println("///////////////////////////////////////////////////////");
    }
}
