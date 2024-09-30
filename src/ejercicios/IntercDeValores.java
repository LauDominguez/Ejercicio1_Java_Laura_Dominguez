package ejercicios;

public class IntercDeValores {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;

        System.out.println("Al intercambiar los valores de A = " + A + " y B = " + B + " obtenemos: " );

        B = A + B;
        A = B - A;
        B = B - A;

        System.out.println("A = " + A + " y B = " + B );
    }
}
