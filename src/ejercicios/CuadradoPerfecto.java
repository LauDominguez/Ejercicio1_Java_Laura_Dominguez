package ejercicios;

public class CuadradoPerfecto {
    public static boolean calcularcp(int A) {
        int raiz = (int) Math.sqrt(A);
        return (raiz * raiz == A);
    }

    public static void main(String[] args) {
        int A = 64;

        if (calcularcp(A)) {

        System.out.println(A + " es un cuadrado perfecto");
    }
        else {
            System.out.println(A + " no es un cuadrado perfecto" );
        }
    }
}

