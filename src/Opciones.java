import java.util.Scanner;

public class Opciones {

    double valorAConvertir = 0;
    Errores caso = new Errores();
    int opcionDelUsuario = 0;

    String menu = """
                -----------------------------------------------------------------------------------------
                Bienvenido al conversor de monedas.

                Menú:                
                1) Dolar estadounidense a peso argentino
                2) Peso argentino a dolar estadounidense
                3) Dolar estadounidense a real brasileño
                4) Real brasileño a dolar estadounidense
                5) Dolar estadounidense a peso colombiano
                6) Peso colombiano a dolar estadounidense
                7) Finalizar
                -----------------------------------------------------------------------------------------

                Por favor elija una opción del 1 al 6 para realizar una operación de cambio de divisas. 
                Si desea finalizar las operaciones y cerrar el programa, por favor elija la opción 7.
                """;

    public void opcionesElegibles() {

        Scanner lectura = new Scanner(System.in);

        while (opcionDelUsuario != 7) {

            System.out.println(menu);

            try {
                opcionDelUsuario = lectura.nextInt();
            } catch (Exception e) {
                System.out.println("Opcion incorrecta, por favor ingrese una opción válida");
                opcionesElegibles();
            }
            switch (opcionDelUsuario) {

                case 1:
                    caso.primerCaso(valorAConvertir);
                    break;

                case 2:

                    caso.segundoCaso(valorAConvertir);
                    break;

                case 3:

                    caso.tercerCaso(valorAConvertir);
                    break;

                case 4:

                    caso.cuartoCaso(valorAConvertir);
                    break;

                case 5:

                    caso.quintoCaso(valorAConvertir);
                    break;

                case 6:

                    caso.sextoCaso(valorAConvertir);
                    break;

                case 7:

                    System.out.println("Finalizando aplicación. Gracias por utilizar nuestros servicios");
                    break;

                default:

                    System.out.println("Esta opción no esta disponible. Por favor, ingrese una opción entre 1 a 6 o si desea finalizar la aplicación ingrese la opción 7");
                    break;

            }
        }
    }
}

