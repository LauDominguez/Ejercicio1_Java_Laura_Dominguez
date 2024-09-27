package ejercicios;

public class ContarDigitos {
    public static void main(String[] args) {
        int a = 987654;
        int cont = String.valueOf(a).length(); // convierte a cadena y cuenta los digitos

        System.out.println("El número " + a + " tiene " + cont + " dígitos");
    }
}
