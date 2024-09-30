package ejercicios;

public class Fibonacci {
    public static void generarF(int N) {
        int a = 0;
        int b = 1;

        System.out.println("*********************************************");
        System.out.println("** Secuencia de Fibonacci con " + N +" términos: **");
        System.out.println("*********************************************");

        System.out.print(a + " " + b);

        for (int i = 2; i < N; i++) {
            int sig = a + b;
            System.out.print(" " + sig);
            a = b;
            b = sig;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int N = 10;
        generarF(N);
    }
}