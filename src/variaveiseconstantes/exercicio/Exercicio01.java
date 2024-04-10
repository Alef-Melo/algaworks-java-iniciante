package variaveiseconstantes.exercicio;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        Double numero = scanner.nextDouble();

        System.out.println("Resultado: " + numero * numero);
    }
}
