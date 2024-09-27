package ejercicios;

public class DecABin {

public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
    //Declaración de variables
    int a = 45;

    String binario = Integer.toBinaryString(a);
    //impresión por consola
    System.out.println("El número Decimal " + a + " equivale a " + binario + " en binario");

}
}