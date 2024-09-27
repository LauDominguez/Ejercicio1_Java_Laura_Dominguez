package ejercicios;

public class RCuadrada {
    public static void main(String[] args) {
        double num = 49;
        double prec = 0.00001;
        double est = num / 2;

        while (Math.abs(est - num / est) > prec) {
            est = (est + num / est) / 2;
        }
        System.out.println("La raiz cuadrada de " + num + "es " + est);
    }
}
