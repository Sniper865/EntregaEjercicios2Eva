package ejercicio7_director;

public class Pelicula {
    private String titulo;
    private int aProduccion;
    private Director director;
    public Pelicula(String titulo){
        this.titulo = titulo;
    }
    public Pelicula(Director director){
        this.director = director;
    }
    public Pelicula(){}

    //titulo
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    //aProduccion
    public int getAProduccion(){
        return aProduccion;
    }
    public void setAProduccion(int aProduccion){
        this.aProduccion = aProduccion;
    }

    //director
    public Director getDirector(){
        return director;
    }
    public void setDirector(Director director){
        this.director = director;
    }

    //toString
    public String toString() {
        return "Titulo de la pelicula: "+ this.titulo+"\n"+
               "Año de produccion: " + this.aProduccion+"\n"+
               "Informacion del director: "+ this.director.toString()+"\n";
    }

}
