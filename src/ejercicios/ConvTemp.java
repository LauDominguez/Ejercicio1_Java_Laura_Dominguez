package ejercicios;

public class ConvTemp {
    public static double calctemp (double c){
        return ((c * 9) / 5)+ 32;

    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de variables
        double c = 25;

        double fah1 = calctemp (c);

        //impresión por consola
        System.out.println(+c+ " grados Celsius equivale a " + fah1 + " grados Fahrenheit");

    }
}
