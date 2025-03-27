public class JuegoAdivinanza {
    public static void main(String[] args) {
        int numeroSecreto = GeneradorNumero.generarNumeroAleatorio();
        LogicaJuego.jugar(numeroSecreto);
    }
}