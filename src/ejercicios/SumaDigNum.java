package ejercicios;

public class SumaDigNum {
    public static int sumar (int a){
        int suma = 0;

        while (a > 0) {
            suma += a % 10; //Obtenemos el último digito del número
            a /= 10; //Eliminamos el último digito del número
        }
        return suma;
    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de variables
        int a = 5678;
        int sumdig = sumar(a);

        //impresión por consola
        System.out.println("La suma de los dígitos del número " + a + " es " + sumdig);

    }
}

