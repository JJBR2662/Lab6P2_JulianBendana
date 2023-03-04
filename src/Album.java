
import java.util.ArrayList;
import java.util.Date;

class Album extends Lanzamiento{
    private int id;
    private ArrayList<Cancion> canciones = new ArrayList();
    private int cantidadcanciones;

    public Album() {
    }

    public Album(int id, int cantidadcanciones, String titulo, String fechalanzamiento, int conteolikes) {
        super(titulo, fechalanzamiento, conteolikes);
        this.id = id;
        this.cantidadcanciones = cantidadcanciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantidadcanciones() {
        return cantidadcanciones;
    }

    public void setCantidadcanciones(int cantidadcanciones) {
        this.cantidadcanciones = cantidadcanciones;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
