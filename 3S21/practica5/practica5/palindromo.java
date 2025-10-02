package practica5;

public class palindromo {

    public static boolean esPalindromo(String cadena, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }

        if (cadena.charAt(inicio) == cadena.charAt(fin)) {
            return esPalindromo(cadena, inicio + 1, fin - 1);
        }

        return false;
    }
}