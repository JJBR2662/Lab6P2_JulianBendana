
import java.util.ArrayList;

public class Oyente extends Usuario{
    private ArrayList<Cancion> cancionesfav = new ArrayList();
    private ArrayList<ListasRepo> listasdereproduccioncreadas = new ArrayList();

    public Oyente() {
    }

    public Oyente(String username, String contra, int edad) {
        super(username, contra, edad);
    }

    public ArrayList<Cancion> getCancionesfav() {
        return cancionesfav;
    }

    public void setCancionesfav(ArrayList<Cancion> cancionesfav) {
        this.cancionesfav = cancionesfav;
    }

    public ArrayList<ListasRepo> getListasdereproduccioncreadas() {
        return listasdereproduccioncreadas;
    }

    public void setListasdereproduccioncreadas(ArrayList<ListasRepo> listasdereproduccioncreadas) {
        this.listasdereproduccioncreadas = listasdereproduccioncreadas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
