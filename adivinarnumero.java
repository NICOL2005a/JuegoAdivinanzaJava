2. Rama logica-juego (Lógica del juego)
java
Copiar
Editar
import java.util.Scanner;

public class LogicaJuego {
    public static void jugar(int numeroSecreto) {
        Scanner scanner = new Scanner(System.in);
        int intentosMaximos = 10;
        int intentos = 0;
        boolean adivinado = false;

        while (intentos < intentosMaximos && !adivinado) {
            System.out.print("Introduce tu número: ");
            int numeroUsuario = scanner.nextInt();
            intentos++;

        if (!adivinado) {
            System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroSecreto);
        }

        scanner.close();
    }
}