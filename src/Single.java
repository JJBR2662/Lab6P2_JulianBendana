
import java.util.Date;

public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
    }

    public Single(Cancion cancion, String titulo, Date fechalanzamiento, int conteolikes) {
        super(titulo, fechalanzamiento, conteolikes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
