package ejercicios;

public class Divisible {
    public static void main(String[] args) {
        int num = 45;

        boolean div2 = (num % 2 == 0);
        boolean div3 = (num % 3 == 0);
        boolean div5 = (num % 5 == 0);

        if (div2) {
            System.out.println(num + " es divisible por 2");
        }
        else {
            System.out.println(num + " no es divisible por 2");
        }

        if (div3) {
            System.out.println(num + " es divisible por 3");
        }
        else {
            System.out.println(num + " no es divisible por 3");
        }

        if (div5) {
            System.out.println(num + " es divisible por 5");
        }
        else {
            System.out.println(num + " no es divisible por 5");
        }
    }
}
