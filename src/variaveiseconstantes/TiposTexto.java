package variaveiseconstantes;

import java.util.Scanner;

public class TiposTexto {
    public static void main(String[] args) {
        /*String nome = "MrBlack";

        System.out.println("Olá " + nome + "!");*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + "!");

        scanner.close();
    }
}
