import java.util.ArrayList;

public class Instagram {
    public static void main(String[] args) {
        
        crearPublicacion();

    }
    
    static void crearPublicacion(){
        Publicacion publicacionPepito = new Publicacion("1", "Pepito");

        
        Publicacion publicacionAmaro = new Publicacion("2", "Amaro");


        publicacionAmaro.darLike();
        publicacionAmaro.darLike();
        publicacionAmaro.darLike();
        publicacionAmaro.darLike();
        publicacionAmaro.darLike();
        
        Publicacion publicacionAlan = new Publicacion("3", "Alan");

        publicacionAlan.darLike();
        publicacionAlan.darLike();
        
        System.out.println("Los autores son: ");
        System.out.println(publicacionPepito.getAutor());
        System.out.println(publicacionAmaro.getAutor());
        System.out.println(publicacionAlan.getAutor());


        System.out.println("Los likes son: ");
        System.out.println(publicacionPepito.getAutor() + ": " + publicacionPepito.getLikes());
        System.out.println(publicacionAmaro.getAutor() + ": " + publicacionAmaro.getLikes());
        System.out.println(publicacionAlan.getAutor() + ": " + publicacionAlan.getLikes());
    }

    Static void enlistarAutores(){
        Autor pepito = new Autor("1", "pepito")
        ArrayList<String> autores = new ArrayList<>();
    autores.add();


    for (int i = 0; i < autores.size(); i++) {
        
    }
    }
}