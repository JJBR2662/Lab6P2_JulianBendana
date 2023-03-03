class Cancion {
    private String titulo;
    private String duracion;
    private int id;

    public Cancion() {
    }

    public Cancion(String titulo, String duracion, int id) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
