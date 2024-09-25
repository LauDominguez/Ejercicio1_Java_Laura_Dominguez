package ejercicios;

public class MaxDeTresNum {
    public static int mayortres (int a, int b, int c){
        int nummay = a;

        if (b > nummay){
            nummay = b;
        }

        if (c > nummay){
            nummay = c;
        }
        return nummay;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 9;

        int nummay = mayortres(a, b, c);

        System.out.println("Entre los números " + a + ", " + b + " y " + c + " el mayor es: " + nummay);
    }
}
