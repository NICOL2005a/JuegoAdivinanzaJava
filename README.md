# 📌 Reporte del Proyecto: Juego de Adivinanza

## 📖 Introducción
Este proyecto consiste en la implementación de un **Juego de Adivinanza**, donde el jugador debe adivinar un número secreto entre 1 y 100 con un límite de intentos. Cada intento proporciona pistas indicando si el número es mayor o menor al ingresado. 

El código fue desarrollado por un equipo de programadores, donde cada integrante se encargó de una parte específica del programa.

## 🛠️ Estructura del Programa

```java
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        int numeroSecreto = generarNumeroAleatorio();
        jugar(numeroSecreto);
    }

    public static int generarNumeroAleatorio() {
        return 0; // Implementación pendiente
    }

    public static void jugar(int numeroSecreto) {
        // Implementación pendiente
    }
}
```

## 👤 Asignación de Responsabilidades

### ✨ Nicol - Estructura del Programa
Nicol diseñó la estructura base del código, incluyendo:
- Declaración de la clase `JuegoAdivinanza`.
- Definición de la función `main()`.
- Creación de los métodos `generarNumeroAleatorio()` y `jugar()`, dejando los espacios para sus implementaciones.

### 🔢 Juan - Implementación de pistas (mayor/menor)
Juan se encargó de proporcionar pistas para ayudar al usuario a adivinar el número:
```java
if (numeroUsuario < numeroSecreto) {
    mostrarMensaje("El número es mayor.");
} else {
    mostrarMensaje("El número es menor.");
}
```
Esto permite que el usuario reciba retroalimentación después de cada intento.

### ⏳ Alondra - Implementación del límite de intentos
Alondra definió el número máximo de intentos y validó que el jugador no pudiera seguir intentando después de agotarlos:
```java
int intentosMaximos = 10;
if (intentos >= intentosMaximos) {
    mostrarMensaje("Lo siento, has agotado tus intentos.");
}
```

### 🔄 Ismael - Implementación de la lógica del juego
Ismael programó el ciclo que permite al usuario hacer múltiples intentos hasta adivinar el número o agotar los intentos:
```java
while (verificarIntentos(intentos, intentosMaximos) && !adivinado) {
    int numeroUsuario = obtenerEntradaUsuario(scanner);
    intentos++;
}
```
Esto garantiza que el juego siga ejecutándose de forma controlada.

### 🎲 Axel - Generación del número aleatorio
Axel implementó la función para generar un número aleatorio entre 1 y 100 utilizando la clase `Random`:
```java
public static int generarNumeroAleatorio() {
    Random random = new Random();
    return random.nextInt(100) + 1;
}
```
Esto asegura que el número secreto sea diferente en cada ejecución del programa.

### 📝 Uso de Scanner
Para permitir la interacción con el usuario, se utilizó la clase `Scanner` en múltiples partes del código, facilitando la entrada de datos:
```java
Scanner scanner = new Scanner(System.in);
int numeroUsuario = scanner.nextInt();
```
Este enfoque garantiza que el usuario pueda introducir sus respuestas de manera sencilla.

## 📌 Conclusión
El desarrollo del **Juego de Adivinanza** fue un trabajo en equipo donde cada integrante contribuyó con una parte esencial del código. Gracias a esta colaboración, se logró un programa funcional que guía al usuario en la búsqueda del número secreto con pistas y un límite de intentos. 

Este ejercicio permitió reforzar habilidades en **estructuración de código, ciclos, condicionales, funciones en Java y manejo de entrada con `Scanner`**. 🎯
