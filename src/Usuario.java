public class Usuario {
    protected String username;
    protected String contra;
    protected int edad;

    public Usuario() {
    }

    public Usuario(String username, String contra, int edad) {
        this.username = username;
        this.contra = contra;
        this.edad = edad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
}
