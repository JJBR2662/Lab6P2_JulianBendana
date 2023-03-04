
import java.util.Date;

public class Lanzamiento {
    protected String titulo;
    protected String fechalanzamiento;
    protected int conteolikes;

    public Lanzamiento() {
    }

    public Lanzamiento(String titulo, String fechalanzamiento, int conteolikes) {
        this.titulo = titulo;
        this.fechalanzamiento = fechalanzamiento;
        this.conteolikes = conteolikes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechalanzamiento() {
        return fechalanzamiento;
    }

    public void setFechalanzamiento(String fechalanzamiento) {
        this.fechalanzamiento = fechalanzamiento;
    }

    public int getConteolikes() {
        return conteolikes;
    }

    public void setConteolikes(int conteolikes) {
        this.conteolikes = conteolikes;
    }

    @Override
    public String toString() {
        return titulo ;
    }
    
    
}
