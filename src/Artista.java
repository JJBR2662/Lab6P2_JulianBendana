
import java.util.ArrayList;

public class Artista extends Usuario{
    private String nombreartistica;
    private ArrayList<Cancion> cancionessuyas = new ArrayList();
    private ArrayList<Album> albumespubblicados = new ArrayList();

    public Artista() {
    }

    public Artista(String nombreartistica, String username, String contra, int edad) {
        super(username, contra, edad);
        this.nombreartistica = nombreartistica;
    }

    public String getNombreartistica() {
        return nombreartistica;
    }

    public void setNombreartistica(String nombreartistica) {
        this.nombreartistica = nombreartistica;
    }

    public ArrayList<Cancion> getCancionessuyas() {
        return cancionessuyas;
    }

    public void setCancionessuyas(ArrayList<Cancion> cancionessuyas) {
        this.cancionessuyas = cancionessuyas;
    }

    public ArrayList<Album> getAlbumespubblicados() {
        return albumespubblicados;
    }

    public void setAlbumespubblicados(ArrayList<Album> albumespubblicados) {
        this.albumespubblicados = albumespubblicados;
    }

    @Override
    public String toString() {
        return nombreartistica;
    }
    
    
}
