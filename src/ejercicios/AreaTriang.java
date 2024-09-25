package ejercicios;

public class AreaTriang {
    public static double calcarea (double b, double h){
        return (b * h) / 2;

    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de variables
        double b = 5;
        double h = 8;

        double sup = calcarea (b, h);

        //impresión por consola
        System.out.println("El área de un triangulo de base " + b + " y altura " + h + " es: " + sup);

    }
}