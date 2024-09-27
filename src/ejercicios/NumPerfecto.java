package ejercicios;

public class NumPerfecto {
    public static void main(String [] args) {
        int num = 28;
        int sumdiv = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sumdiv += i;
            }
        }
        if (sumdiv == num){
            System.out.println(num + " es un número perfecto");
        }
        else {
            System.out.println(num + " no es un número perfecto");
        }
    }
}
