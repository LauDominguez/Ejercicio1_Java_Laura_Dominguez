package ejercicios;

public class Factorial {

            public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
            //Declaración de variables
            int a = 6;
            int fact1 = 1;
            for (int i = 1; i <= a; i++) {
                fact1 *= i;

            }
                //impresión por consola
                System.out.println("El factorial del número " + a + " es " + fact1);

            }
}



