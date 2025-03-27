import java.util.Random;

public class GeneradorNumero {
    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Número entre 1 y 100
    }
}