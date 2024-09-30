package ejercicios;

public class MCD {
    public static int calcular(int A, int B){
        while (B != 0) {
        int mcd = A % B;
        A = B;
        B = mcd;
        }
        return A;
    }

public static void main(String[] args) {
    int A =48;
    int B = 18;

    System.out.println("Dado " + A + " y " + B + " su MCD es " + calcular(A, B));
}
}