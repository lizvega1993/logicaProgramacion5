import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("manzana", "apple");
        diccionario.put("coche", "car");
        diccionario.put("ordenador", "computer");
        diccionario.put("ciudad", "city");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("planta", "plant");
        diccionario.put("pelota", "ball");
        diccionario.put("aire", "air");
        diccionario.put("mar", "sea");
        diccionario.put("montaña", "mountain");
        diccionario.put("flor", "flower");

        Random random = new Random();
        Object[] keys = diccionario.keySet().toArray();
        int totalPalabras = 5;
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        System.out.println("¡Bienvenido al juego de traducción español-inglés!");
        System.out.println("Por favor, traduce las siguientes palabras al inglés:");

        for (int i = 0; i < totalPalabras; i++) {
            String palabraEspanol = (String) keys[random.nextInt(keys.length)];
            String palabraIngles = diccionario.get(palabraEspanol);

            System.out.print((i + 1) + ". " + palabraEspanol + ": ");
            Scanner scanner = new Scanner(System.in);
            String traduccionUsuario = scanner.nextLine();

            if (traduccionUsuario.equalsIgnoreCase(palabraIngles)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + palabraIngles);
                respuestasIncorrectas++;
            }
        }

        System.out.println("\nResumen:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}
