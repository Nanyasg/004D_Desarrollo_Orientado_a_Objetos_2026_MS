public class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    private int likes;
    protected boolean estaActiva;


    Publicacion(String id, String autor){
        this.id = id;
        this.autor = autor;
        this.likes = 0;

    }

    public void setAutor(String nombre){
        if (nombre.length() > 20){
            System.out.println("El nombre no puede exceder los 20 caracteres");
        }else{
        this.autor = nombre;
    }
    }

    public String getAutor(){
        return this.autor;
    }


    public void darLike(){
        this.likes += 1;
    }

    public int getLikes(){
        return this.likes;
    }
}

// identificar cual de mis clases debiese tener metodo constructor y que atributos debiesen nacer con ella