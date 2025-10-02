package practica6;
import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero (pequeño) para calcular su factorial: ");
        int numero = scanner.nextInt();

        int resultado = factorial(numero);
        System.out.println(numero + "! = " + resultado);

        scanner.close();
    }
}