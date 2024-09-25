package ejercicios;

public class NumInvertido {
    public static int invertir (int a){
        int invertido = 0;

        while (a != 0) {
            int dig = a % 10;
            invertido = invertido * 10 + dig;
            a /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de variables
        int a = 54321;
        int numinv = invertir (a);

        //impresión por consola
        System.out.println("El número invertido de " + a + " es " + numinv);

    }
}
