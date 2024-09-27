package ejercicios;

public class SumaNumPares {
    public static int Sumar(int a, int b){//declaración del metodo
        int sum = 0;
        for (int i = a; i <= b; i++) {

        if (i % 2 == 0) {
            sum += i;
        }

        } return sum;
    }


    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
        //Declaración de Variable
        int a = 1;
        int b = 100;
        int suma = Sumar(a, b);


        //Llama al metodo
     //Sumar(a, b);
        //impresión por consola
        System.out.println("La sumatoria de los nímeros pares comprendidos en el rango de  " + a + " a " + b + " es " + suma);
    }
    }