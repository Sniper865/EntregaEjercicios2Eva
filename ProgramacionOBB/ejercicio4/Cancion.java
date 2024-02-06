package ejercicio4;

public class Cancion {
    private String titulo, autor;

    public Cancion(String titulo, String autor) {
        this.titulo = "";
        this.autor = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String toString(){
        return "Titulo de la cancion: "+ getTitulo()+"\n"+
               "Autor de la cancion: "+ getAutor();
    }

}
