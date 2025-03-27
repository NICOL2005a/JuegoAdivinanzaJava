 

import java.util.concurrent.ThreadLocalRandom;

public class JuegoAdivinanza {

    // Función que genera un número aleatorio entre 1 y 100
    public static int generarNumeroAleatorio() {
        // ThreadLocalRandom es más moderno y seguro para entornos multihilo que Random
        return ThreadLocalRandom.current().nextInt(1, 101); // El límite superior es exclusivo
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la función
        int numeroGenerado = generarNumeroAleatorio();
        System.out.println("Número aleatorio generado (oculto en la versión final del juego): " + numeroGenerado);
    }
}
