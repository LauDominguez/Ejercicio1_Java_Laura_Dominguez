package ejercicios;

public class Armstrong {
    public static void main(String[] arg){
        int num = 153;
        int orig = num;
        int suma = 0;
        int digitos = String.valueOf(num).length();

        while (num != 0) {
            int dig = num % 10;
            suma += Math.pow(dig, digitos);
            num /= 10;
        }
        if (suma == orig){
            System.out.println(orig + " es un número Armstrong");
        }
        else {
            System.out.println(orig + " no es un número Armstrong");
        }
    }
}
