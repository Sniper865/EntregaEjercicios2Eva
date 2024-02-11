public class ejerciciosArrays {
    public static void main(String[] args) {
        // Declarar y construir un array de enteros arrayDigitos del 0 al 10
        int[] arrayDigitos = new int[11];
        for (int i = 0; i <= 10; ++i) {
            arrayDigitos[i] = i;
        }

        // Imprimir la longitud de array
        System.out.println("Longitud de arrayDigitos: " + arrayDigitos.length);

        // Imprimir todos los elementos de array
        System.out.println("Elementos de arrayDigitos:");
        for (int i = 0; i <= 10; ++i) {
            System.out.print(arrayDigitos[i] + " ");
        }
        System.out.println();

        // Imprimir todos los elementos de array en horizontal
        System.out.print("Elementos de arrayDigitos en horizontal: ");
        for (int i = 0; i <= 10; ++i) {
            System.out.print(arrayDigitos[i] + " ");
        }
        System.out.println();

        // Declarar y construir un array de enteros arrayDigitos2 del 9 al 0
        int[] arrayDigitos2 = new int[10];
        for (int i = 0, j = 9; i < 10; ++i, --j) {
            arrayDigitos2[i] = j;
        }

        // Declarar y construir un array de caracteres arrayChar1 con las vocales
        char[] arrayChar1 = {'a', 'e', 'i', 'o', 'u'};

        // Declarar y construir un array de caracteres arrayChar2 con las primeras letras del abecedario
        char[] arrayChar2 = {'a', 'b', 'c', 'd', 'e'};

        // Concatenar las vocales de arrayChar1 en una cadena cadChar1
        String cadChar1 = "";
        for (char c : arrayChar1) {
            cadChar1 += c;
        }

        // Obtener una cadena cadChar2 con las 5 letras de arrayChar2
        String cadChar2 = new String(arrayChar2);

        // Mostrar las diferentes cadenas
        System.out.println("Cadena de vocales: " + cadChar1);
        System.out.println("Cadena de letras: " + cadChar2);

        // Mostrar un texto intercalado entre las vocales y las letras
        System.out.println("Texto intercalado: " + intercalarCadenas(cadChar1, cadChar2));

        // Mostrar el resultado de sumar cada posición del array arrayDigitos con arrayDigitos2
        System.out.print("Suma de arrays: ");
        for (int i = 0; i < arrayDigitos.length && i < arrayDigitos2.length; i++) {
            System.out.print((arrayDigitos[i] + arrayDigitos2[i]) + " ");
        }
        System.out.println();
    }

    // Método para intercalar dos cadenas alternando caracteres
    private static String intercalarCadenas(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            result.append(s1.charAt(i)).append(s2.charAt(i));
        }
        if (s1.length() > minLength) {
            result.append(s1.substring(minLength));
        }
        if (s2.length() > minLength) {
            result.append(s2.substring(minLength));
        }
        return result.toString();
    }
}
