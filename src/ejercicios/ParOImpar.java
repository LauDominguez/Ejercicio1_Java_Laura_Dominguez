package ejercicios;

public class ParOImpar {// def de clase
    public static void ParImpar(int a){//declaración del metodo
        if (a % 2 == 0) {
            System.out.println("El número " + a +" es par");
        }
        else {
            System.out.println("El número " + a +" es impar");
        }
    }

    public static void main(String[] args) {// define la función main en la que permite ejecutar la aplicación
     //Declaración de Variable
        int a = 15;

        //Llama al metodo
            ParImpar(a);
    }
}
