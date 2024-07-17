import java.util.Scanner;

public class Errores {

    double valorNuevo = 0;

    public void primerCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();
        System.out.println(" ");

        System.out.println("Ingrese el monto de dinero en dolares a convertir");
        System.out.println(" ");

        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("USD", "ARS", valor);
            System.out.println(" ");

        } catch (Exception i) {
            System.out.println("El valor ingresado no es numérico. Ingrese un valor numérico para continuar");
            primerCaso(valorNuevo);
        }
    }

    public void segundoCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();
        System.out.println(" ");

        System.out.println("Ingrese el monto de dinero en pesos argentinos a convertir");
        System.out.println(" ");

        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("ARS", "USD", valor);
            System.out.println(" ");
        } catch (Exception i) {
            System.out.println("El valor ingresado no es numérico. Ingrese un valor numérico para continuar");
            segundoCaso(valorNuevo);
        }
    }

    public void tercerCaso(double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();
        System.out.println(" ");

        System.out.println("Ingrese el monto de dinero en dolares a convertir");
        System.out.println(" ");

        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("USD", "BRL", valor);
            System.out.println(" ");
        } catch (Exception i) {
            System.out.println("El valor ingresado no es numérico. Ingrese un valor numérico para continuar");
            tercerCaso(valorNuevo);
        }
    }

    public void cuartoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();
        System.out.println(" ");

        System.out.println("Ingrese el monto de dinero en reales brasileños a convertir");
        System.out.println(" ");

        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("BRL", "USD", valor);
            System.out.println(" ");
        } catch (Exception i) {
            System.out.println("El valor ingresado no es numérico. Ingrese un valor numérico para continuar");
            cuartoCaso(valorNuevo);
        }
    }

    public void quintoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();
        System.out.println(" ");

        System.out.println("Ingrese el monto de dinero en dolares a convertir");
        System.out.println(" ");

        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("USD", "COP", valor);
            System.out.println(" ");
        } catch (Exception i) {
            System.out.println("El valor ingresado no es numérico. Ingrese un valor numérico para continuar");
            quintoCaso(valorNuevo);
        }
    }

    public void sextoCaso (double valor) {
        Scanner lectura = new Scanner(System.in);
        API monedasParaConvertir = new API();
        System.out.println(" ");

        System.out.println("Ingrese el monto de dinero en pesos colombianos a convertir");
        System.out.println(" ");

        try {
            valor = lectura.nextDouble();
            monedasParaConvertir.obtencionDeApi("COP", "USD", valor);
            System.out.println(" ");
        } catch (Exception i) {
            System.out.println("El valor ingresado no es numérico. Ingrese un valor numérico para continuar");
            sextoCaso(valorNuevo);
        }
    }
}

