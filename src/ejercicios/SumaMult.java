package ejercicios;

public class SumaMult {
    public static void main(String[] args) {
        int num = 3;
        int limsup = 50;
        int suma= 0;

        for (int i = 1; i <= limsup; i++) {
            if (i % num == 0) {
                suma += i;
            }
        }
        System.out.println("La sumatoria de los múltiplos de " + num + " en el rango de 1 a " + limsup + " es " + suma);
    }
}
