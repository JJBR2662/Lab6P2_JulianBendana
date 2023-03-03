
import java.util.ArrayList;

class ListasRepo {
    private String nombre;
    private int cantlikes;
    private ArrayList<Cancion> canciones = new ArrayList();

    public ListasRepo() {
    }

    public ListasRepo(String nombre, int cantlikes) {
        this.nombre = nombre;
        this.cantlikes = cantlikes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantlikes() {
        return cantlikes;
    }

    public void setCantlikes(int cantlikes) {
        this.cantlikes = cantlikes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
