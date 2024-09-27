package ejercicios;

public class AreaCirc {
    public static double calcirc (double r){
        return (3.1416 * r * r);

    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de variables
        double r = 7;

        double sup = calcirc (r);

        //impresión por consola
        System.out.println("El área de un circulo de radio " + r + " es: " + sup);

    }
}
