package ejercicios;

public class TablaDeMultiplicar {
    public static void main(String[] args) {
        int num = 7;

        System.out.println("********************************");
        System.out.println("** Tabla de Multiplicar de " + num +": **");
        System.out.println("********************************");
        for (int i =1; i<= 12; i++) {
            int tabla = num * i;
            System.out.println("  #  " + num + " x " + i + " = " + tabla);
        }
    }
}
