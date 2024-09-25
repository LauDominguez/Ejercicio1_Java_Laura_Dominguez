package ejercicios;

public class Promedio {
    public static double promediar (double a, double b, double c){
        double suma = a + b + c;
        return suma / 3;


    }
    public static void main(String[] args) {
        double a = 4;
        double b = 9;
        double c = 13;

        double promedio = promediar (a, b, c);

        System.out.println("El promedio entre los números " + a + ", " + b + " y " + c + " es: " + promedio);
    }

}
