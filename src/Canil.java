public class Canil {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~ Bienvenido al Canil ~~~~~~~~~~~");

        Perro perro_del_profe = new Perro();

        perro_del_profe.nombre = "Gimli";
        perro_del_profe.edad = 6;
        perro_del_profe.peso = 40;
        perro_del_profe.tiene_vacuna = false;

        Perro perro_de_marianny = new Perro();

        perro_de_marianny.nombre = "Brillito";
        perro_de_marianny.edad = 11;
        perro_de_marianny.peso = 10.5;
        perro_de_marianny.tiene_vacuna = true;


        Perro perro_de_pepito = new Perro();

        perro_de_pepito.nombre = "Porky";
        perro_de_pepito.edad = 5;
        perro_de_pepito.peso = 15.82;
        perro_de_pepito.tiene_vacuna = true;


        if (perro_de_pepito.edad > 2) {
        System.out.print("Porky tiene más de 2 años.");
        } else {
            System.out.print("Porky tiene menos de 2 años");
        }


        if (perro_de_pepito.peso > 20) {
            System.out.println("Perro pesado");

        }
        else {
            System.out.println("Perro liviano");
        }
        System.out.println("Gracias por su visita");
    }
}
