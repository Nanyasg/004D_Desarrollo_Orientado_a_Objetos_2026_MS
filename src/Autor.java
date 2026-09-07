public class Autor {
    private String id;
    private String nombre;
    private int num_publicaciones;

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getnum_publicaciones() {
        return num_publicaciones;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
    if (nombre.length() > 20 || nombre.length() < 1){
            System.out.println("El nombre debe tener mas de 1 caracter y no puede exceder los 20 caracteres");
        }else{
        this.nombre = nombre;}
    }
    public void setnum_publicaciones(int num_publicaciones){
        this.num_publicaciones = num_publicaciones;
    }
    public Autor(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    
}
