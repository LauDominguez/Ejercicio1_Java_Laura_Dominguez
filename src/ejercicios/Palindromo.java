package ejercicios;

public class Palindromo {
    public static int determinarp (int a){
        int invertido = 0;
        int orig = a;

        while (a != 0) {
            int dig = a % 10;
            invertido = invertido * 10 + dig;
            a /= 10;
        }
        if (orig == invertido){
            System.out.println("El número " + orig + " es Palindromo" );
        }
        else {
            System.out.println("El número " + orig + " no es Palindromo" );
        }
        return invertido;
    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de variables
        int a = 1221;
        int numinv = determinarp (a);

    }
}
