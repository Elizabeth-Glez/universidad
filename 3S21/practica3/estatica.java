package practica3;

public class estatica {
    public static void main(String[] args) {
        int[] num = new int[10];
        System.out.println("Capturar valores");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Captura valor de la posicion " + i + ": ");
            num[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Mostrar valores");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Valor en la posicion " + i + ": " + num[i]);
        }
    }
}
