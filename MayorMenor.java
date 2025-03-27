if (numeroUsuario == numeroSecreto) {
    System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
    adivinado = true;
    } else if (numeroUsuario < numeroSecreto) {
        System.out.println("El número es mayor.");
    } else {
        System.out.println("El número es menor.");
    }
}