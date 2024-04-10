package comecando.exercicio;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        Double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura: ");
        Double altura = scanner.nextDouble();

        Double alturaQuadrada = altura * altura;
        Double resultado = peso / alturaQuadrada;

        System.out.print("Seu indice de massa corporal é: " + resultado);


    }
}
