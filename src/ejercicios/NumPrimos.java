package ejercicios;

public class NumPrimos {
    public static boolean Primos (int a){//declaración de metodo
        if (a <= 1) {
            return false;
                 }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false; // Si encuentra un numero divisor entonces no es primo
            }

       }
        return true; // Si no encuentra un numero divisor entonce, es primo
    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
    //Declaración de Variable
        int a = 29;
        if (Primos(a)) {
            System.out.println("El número " + a + " es primo.");
        }
        else {
             System.out.println(" El número " + a + " no es primo");
        }
    }
}