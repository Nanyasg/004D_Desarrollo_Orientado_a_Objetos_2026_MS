 hacer que el metodo crear personaje me permita seleccionar el tipo de personaje que deseo crear. inventar un propio personaje. finalmente agregar los atributos y comportamientos propios de cada clase

      switch (opcion_tipoPersonaje) {

        case "1":

        Hacker aaaa oo

          break;

        case "2":

          verDatosDelPersonaje(scanner, personaje_jugador);

          break;

        case "3":

          System.out.println("Cosas de opcion 3");

          mantener_menu = false;

          break;



        default:

          System.out.println("Por favor ingrese una opción valida");

          break;

      }

  }

        case "4":
          testeandoCositas();
          break;


            static void testeandoCositas(){
    System.out.println("Este es el hacker");
    Personaje hacker = new Hacker();
    hacker.trabajar();

    hacker.validarNombre("Carlitos");
    System.out.println(hacker.mostrarNombre());

    System.out.println("Este es el gamedev");
    Personaje gamedev = new Gamedev();
    gamedev.trabajar();
    
  }