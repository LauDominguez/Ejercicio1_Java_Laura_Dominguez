package ejercicios;

public class NumNaturales {
    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de variables
        int N = 50;
        int Nat = 0;
        for (int i = 1; i <= N; i++) {
            Nat += i;

        }
        //impresión por consola
        System.out.println("La sumatoria de los primeros " + N + " Números Naturales es " + Nat);

    }
}
