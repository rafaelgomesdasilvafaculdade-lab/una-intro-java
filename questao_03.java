import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dois números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        // Operações
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        
        // Para evitar divisão por zero
        if (num2 != 0) {
            double divisao = (double) num1 / num2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão: impossível dividir por zero!");
        }

        // Resultados
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);

        scanner.close();
    }
}