import java.util.Scanner;
import java.util.ArrayList;
public class Colecciones {
    public static void main(String[] args) {
        
        System.out.println("Todo impeke");
        Scanner sc = new Scanner(System.in);

        boolean mostrar_menu = true;
        while(mostrar_menu) {
            System.err.println("1. Conociendo Arrays");
            System.err.println("2.Conociendo Arraylist");
            System.err.println("3.Salir");

            System.out.println("Ingrese una opcion");
            String opcion_ingresada = sc.nextLine();

            switch (opcion_ingresada){
                case "1":
                    conociendoArrays();
                    break;
                case "2":
                    conociendoArraylist();
                case "3":
                    break;
            }}
        }
        static void conociendoArrays(){
            String[] alumnos = new String[4];
        alumnos[0] = "Diego Marin";
        alumnos[1] = "Amaro Lopez";
        alumnos[2] = "Marianny Sanchez";
        alumnos[3] = "Gustavo Araneda";

        Integer[] edades = new Integer[4];
        edades[0] = 18;
        edades[1] = 19;
        edades[2] = 19;
        edades[3] = 18;

        System.out.println("Datos de " + alumnos[0] + " edad: " + edades[0]);
        System.out.println("Datos de " + alumnos[1] + " edad: " + edades[0]);
        System.out.println("Datos de " + alumnos[2] + " edad: " + edades[0]);
        System.out.println("Datos de " + alumnos[3] + " edad: " + edades[0]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Datos de " + alumnos[i] + " edad: " + edades[i]);
        }
        
    }

    static void conociendoArraylist(){
        ArrayList<String> alumnos = new ArrayList<>();

alumnos.add("Diego Marin");
alumnos.add("Amaro Lopez");
alumnos.add("Marianny Sanchez");
alumnos.add("Gustavo Araneda");

alumnos.set(1, "Amaro López");
alumnos.remove(1);
System.err.println(alumnos.get(2));
for (int i = 0; i < alumnos.size(); i++) {
            System.out.println(alumnos.get(i));
        }
    }
}

// Crear rama nueva llamada proyecto/instagram en donde debes crear el diagrama de clases uml de instagram disponible en la pag web del curso.
// Desafio: El autor debe ser una clase en lugar de un atributo, y usted debe implementar un metodo que me permita almacenar multiples autores. luego implemente un 
// segundo metodo para mostrar esos autores