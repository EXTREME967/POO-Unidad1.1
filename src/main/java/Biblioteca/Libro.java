/*
 */
package Biblioteca;


public class Libro {
    private String Titulo;
    private String Autor;
    private int ISBN;
    private String Clasificacion;
    private String Editorial;
    private int NoPaginas;
    
    public Libro(){
        this.Titulo="";
        this.Autor="";
        this.ISBN=0;
        this.Clasificacion="";
        this.Editorial="";
        this.NoPaginas=0;
    }

    public Libro(String Titulo, String Autor, int ISBN, String Clasificacion, String Editorial, int NoPaginas) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.Clasificacion = Clasificacion;
        this.Editorial = Editorial;
        this.NoPaginas = NoPaginas;
    }
    
    public void MostrarDatos(){
        System.out.println("Datos del Objeto");
        System.out.println("Titulo: " + this.Titulo);
        System.out.println("Autor: " + this.Autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Clasificacion: " + this.Clasificacion);
        System.out.println("Editorial: " + this.Editorial);
        System.out.println("N. Paginas: " + this.NoPaginas);
    }    
}
