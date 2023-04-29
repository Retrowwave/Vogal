import java.util.Scanner;

/* Escreva um algoritmo que solicite ao usuário um caractere e exiba se o
caractere é uma vogal, uma consoante ou um caractere inválido.  */

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite uma vogal ou consoante:");
        String palavra = scanner.nextLine().toLowerCase();

        switch (palavra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            System.out.println(palavra + " é uma vogal.");
                break;
            default:
            System.out.println(palavra + " é uma consoante.");
                break;
        }
        scanner.close();
    }
}
