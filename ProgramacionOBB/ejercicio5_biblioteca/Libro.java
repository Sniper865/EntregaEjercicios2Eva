package ejercicio5_biblioteca;

import ejercicio2_fecha.*;
public class Libro {
    private String titulo, isbn, editorial, ciudad, pais;
    private Persona autor;
    private Fecha fecha;
    public static int creados;
    public Libro(String titulo, String isbn, String editorial, String ciudad, String pais){
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.pais = pais;
        creados++;
    }

    //titulo
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //isbn
    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    //editorial
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }

    //ciudad
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    //pais
    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }

    //autor
    public Persona getAutor(){
        return autor;
    }
    public void setAutor(Persona autor){
        this.autor = autor;
    }

    //fecha
    public Fecha getFecha(){
        return fecha;
    }
    public void setFecha(Fecha fecha){
        this.fecha = fecha;
    }
    public static int getCreados(){
        return creados;
    }
    public static int restarCreados(){
        return creados--;
    }

    //toString
    public String toString(){
        return "Titulo: "+this.titulo+"\n"+
               "Autor: "+ this.autor.toString()+"\n"+ 
               "ISBN: "+ this.isbn+"\n"+ 
               "Fecha: "+ this.fecha.toString()+"\n"+
               "Editorial: "+ this.editorial+"\n"+
               "Lugar: "+ this.ciudad+","+this.pais;

    }
}

