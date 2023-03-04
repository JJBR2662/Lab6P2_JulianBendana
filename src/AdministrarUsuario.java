
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AdministrarUsuario {

    private ArrayList<Usuario> listausers = new ArrayList();
    private File archivo;

    public AdministrarUsuario() {
    }

    public AdministrarUsuario(File archivo) {
        this.archivo = archivo;
    }
    
    public AdministrarUsuario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListausers() {
        return listausers;
    }

    public void setListausers(ArrayList<Usuario> listausers) {
        this.listausers = listausers;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void SetUsuario(Usuario u) {
        this.listausers.add(u);
    }

    @Override
    public String toString() {
        return "AdministrarUsuario{" + "listausers=" + listausers + ", archivo=" + archivo + '}';
    }

    public void Escribirarchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario c : listausers) {
                String acc = "";
                if (c instanceof Artista) {
                    //cada atributo de artista es |
                    //cada atributo de las canciones en la lista de canciones fav es ,
                    //cada atributo de las canciones en la lista de albumespublicados es -
                    //cada album es ;
                    acc += c.getUsername() + "|" + c.getContra()+ "|" + c.getEdad() + "|";
                    acc += ((Artista) c).getNombreartistica() + "|";
                    if (((Artista) c).getCancionessuyas().isEmpty()) {
                        acc += "|";
                    } else {
                        for (int i = 0; i < ((Artista) c).getCancionessuyas().size(); i++) {
                            if (i == ((Artista) c).getCancionessuyas().size() - 1) {
                                acc += ((Artista) c).getCancionessuyas().get(i).getTitulo() + "," + ((Artista) c).getCancionessuyas().get(i).getDuracion() + "," + ((Artista) c).getCancionessuyas().get(i).getId() + "|";
                            } else {
                                acc += ((Artista) c).getCancionessuyas().get(i).getTitulo() + "," + ((Artista) c).getCancionessuyas().get(i).getDuracion() + "," + ((Artista) c).getCancionessuyas().get(i).getId() + ",";
                            }
                        }
                    }
                    if (((Artista) c).getAlbumespubblicados().isEmpty()) {
                        acc += "|";
                    } else {
                        for (int i = 0; i < ((Artista) c).getAlbumespubblicados().size(); i++) {
                            String mane = "";
                            for (int j = 0; j < ((Artista) c).getAlbumespubblicados().get(i).getCanciones().size(); j++) {
                                if (j == ((Artista) c).getAlbumespubblicados().get(i).getCanciones().size() - 1) {
                                    mane += ((Artista) c).getAlbumespubblicados().get(i).getCanciones().get(j).getTitulo() + "-" + ((Artista) c).getAlbumespubblicados().get(i).getCanciones().get(j).getDuracion() + "-" + ((Artista) c).getAlbumespubblicados().get(i).getCanciones().get(j).getId() + ";";
                                } else {
                                    mane += ((Artista) c).getAlbumespubblicados().get(i).getCanciones().get(j).getTitulo() + "-" + ((Artista) c).getAlbumespubblicados().get(i).getCanciones().get(j).getDuracion() + "-" + ((Artista) c).getAlbumespubblicados().get(i).getCanciones().get(j).getId() + "-";
                                }
                            }
                            if (i == ((Artista) c).getAlbumespubblicados().size() - 1) {
                                acc += ((Artista) c).getAlbumespubblicados().get(i).getId()+";"+ ((Artista) c).getAlbumespubblicados().get(i).getCantidadcanciones()+";"+((Artista) c).getAlbumespubblicados().get(i).getTitulo() + ";" + mane + ""+((Artista) c).getAlbumespubblicados().get(i).getFechalanzamiento()+";"+((Artista) c).getAlbumespubblicados().get(i).getConteolikes()+"|";
                            } else {
                                acc += ((Artista) c).getAlbumespubblicados().get(i).getId()+";"+ ((Artista) c).getAlbumespubblicados().get(i).getCantidadcanciones()+";"+((Artista) c).getAlbumespubblicados().get(i).getTitulo() + ";" + mane + ""+((Artista) c).getAlbumespubblicados().get(i).getFechalanzamiento()+";"+((Artista) c).getAlbumespubblicados().get(i).getConteolikes()+";";
                            }
                        }
                    }
                } else {
                    //cada atributo de oyente es %
                    //cada atributo de canciones favoritas de oyentes es &
                    //cada atributo de cancion de lista de reproducciones es *
                    //cada atributo de lista de repo es $
                    acc += c.getUsername() + "%" + c.getContra() + "%" + c.getEdad() + "%";
                    if (((Oyente) c).getCancionesfav().isEmpty()) {
                        acc += "%";
                    } else {
                        for (int i = 0; i < ((Oyente) c).getCancionesfav().size(); i++) {
                            if (i == ((Oyente) c).getCancionesfav().size() - 1) {
                                acc += ((Oyente) c).getCancionesfav().get(i).getTitulo() + "&" + ((Oyente) c).getCancionesfav().get(i).getDuracion() + "&" + ((Oyente) c).getCancionesfav().get(i).getId() + "%";
                            } else {
                                acc += ((Oyente) c).getCancionesfav().get(i).getTitulo() + "&" + ((Oyente) c).getCancionesfav().get(i).getDuracion() + "&" + ((Oyente) c).getCancionesfav().get(i).getId() + "&";
                            }
                        }
                    }
                    if (((Oyente) c).getListasdereproduccioncreadas().isEmpty()) {
                        acc+="%";
                    }else{
                        for (int i = 0; i < ((Oyente) c).getListasdereproduccioncreadas().size(); i++) {
                            String coman = "";
                            for (int j = 0; j < ((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().size(); j++) {
                                if (j == ((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().size()-1){
                                    coman += ((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().get(j).getTitulo() + "*" +((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().get(j).getDuracion()+ "*" +((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().get(j).getId()+"%";
                                }else{
                                    coman += ((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().get(j).getTitulo() + "*" +((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().get(j).getDuracion()+ "*" +((Oyente) c).getListasdereproduccioncreadas().get(i).getCanciones().get(j).getId()+"*";
                                }
                            }
                            if (i == ((Oyente) c).getListasdereproduccioncreadas().size()-1) {
                                acc += ((Oyente) c).getListasdereproduccioncreadas().get(i).getNombre()+"$"+((Oyente) c).getListasdereproduccioncreadas().get(i).getCantlikes()+"$"+coman+"%";
                            }else{
                                acc += ((Oyente) c).getListasdereproduccioncreadas().get(i).getNombre()+"$"+((Oyente) c).getListasdereproduccioncreadas().get(i).getCantlikes()+"$"+coman+"$";
                            }
                        }
                    }
                }
                bw.write(acc);
                bw.newLine();
            }
            bw.flush();

        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    public void Cargararchivo() {
        //OYENTE
        ArrayList<Cancion> cancionesfavoyente;
        ArrayList<ListasRepo> listasderepooyente;
        
        //ARTISTA
        ArrayList<Cancion> cancionessuyas;
        ArrayList<Album> albumes;
        Scanner kimmich=null;
        Scanner muller =null;
        Scanner musiala =null;
        Scanner sane = null;
        Scanner neuer = null;
        Scanner choupo = null;
        Scanner gnabry = null;
        if (archivo.exists()) {
            try {
                kimmich = new Scanner(archivo);
                kimmich.useDelimiter("");
                while (kimmich.hasNextLine()) {
                    String linea = kimmich.nextLine();
                    String[] pedazosartista = linea.split("\\|");
                    String[] pedazosoyentes = linea.split("\\%");
                    if (pedazosartista.length>1) {
                        String user1 = pedazosartista[0];
                        String contra1 = pedazosartista[1];
                        int edad1 = Integer.parseInt(pedazosartista[2]);
                        String nombreart = pedazosartista[3];
                        neuer = new Scanner(pedazosartista[4]);
                        neuer.useDelimiter(",");
                        cancionessuyas = new ArrayList();
                        while (neuer.hasNext()) {
                            String titulo3 = neuer.next();
                            String duracion3 = neuer.next();
                            int id3 = Integer.parseInt(neuer.next());
                            Cancion song3 = new Cancion(titulo3, duracion3, id3);
                            cancionessuyas.add(song3);
                        }
                        choupo = new Scanner(pedazosartista[5]);
                        choupo.useDelimiter(";");
                        albumes = new ArrayList();
                        while (choupo.hasNext()) {
                            int id = Integer.parseInt(choupo.next());
                            int cantcanciones = Integer.parseInt(choupo.next());
                            String tituloalbum = choupo.next();
                            String mane = choupo.next();
                            String fecha = choupo.next();
                            int conteolikes = Integer.parseInt(choupo.next());
                            Album album = new Album(id, cantcanciones, tituloalbum, fecha,  conteolikes);
                            gnabry=new Scanner(mane);
                            gnabry.useDelimiter("-");
                            while (gnabry.hasNext()) {
                                String titulo200 = gnabry.next();
                                String duracion200 = gnabry.next();
                                int id200 = Integer.parseInt(gnabry.next());
                                Cancion cancion200 = new Cancion(titulo200, duracion200, id200);
                                album.getCanciones().add(cancion200);
                            }
                            albumes.add(album);
                        }
                        listausers.add(new Artista(nombreart, user1, contra1, edad1));
                        
                        
                        
                    }else if(pedazosoyentes.length>1){
                        String user = pedazosoyentes[0];
                        String contra = pedazosoyentes[1];
                        int edad = Integer.parseInt(pedazosoyentes[2]);
                        muller = new Scanner(pedazosoyentes[3]);
                        muller.useDelimiter("&");
                        cancionesfavoyente = new ArrayList();
                        while (muller.hasNext()) {
                            String titulo = muller.next();
                            String duracion = muller.next();
                            String ids = muller.next();
                            int id = Integer.parseInt(ids);
                            Cancion song = new Cancion(titulo, duracion, id);
                            cancionesfavoyente.add(song);
                        }
                        musiala = new Scanner(pedazosoyentes[4]);
                        musiala.useDelimiter("$");
                        listasderepooyente = new ArrayList();
                        while (musiala.hasNext()) {
                            String nombre = musiala.next();
                            String likes = musiala.next();
                            String mascanciones = musiala.next();
                            int like = Integer.parseInt(likes);
                            ListasRepo repos = new  ListasRepo(nombre, like);
                            sane = new Scanner(mascanciones);
                            sane.useDelimiter("*");
                            while (sane.hasNext()) {
                                String titulo2 = sane.next();
                                String duracion2 = sane.next();
                                String ids2 = sane.next();
                                int id2 = Integer.parseInt(ids2);
                                Cancion song2 = new Cancion(titulo2, duracion2, id2);
                                repos.getCanciones().add(song2);
                            }
                            listasderepooyente.add(repos);
                        }
                        Oyente cliente = new Oyente(user, contra, edad);
                        cliente.setCancionesfav(cancionesfavoyente);
                        cliente.setListasdereproduccioncreadas(listasderepooyente);
                        listausers.add(cliente);
                    }
                }
            } catch (Exception e) {
            }
        }
    }
}
