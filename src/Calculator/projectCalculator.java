package Calculator;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class projectCalculator {
    public static class calculator {
        public static void main(String[] args) {
            //CRIAR UMA CALCULADORA E IR EVOLUINDO

            Scanner scanner = new Scanner(System.in);

            double valor1;
            double valor2;
            String operacao;
            boolean continuar;
            do {
                try {
                    System.out.println("Digite o primeiro número: ");
                    valor1 = scanner.nextDouble();

                    System.out.println("Digite a operação desejada: ");
                    operacao = scanner.next();

                    System.out.println("Digite o segundo número: ");
                    valor2 = scanner.nextDouble();

                    System.out.println("Resultado " + calculo(valor1, valor2, operacao));

                    scanner.nextLine(); // Limpa o "Enter" antes da pergunta final
                    continuar = verificarOperacao();

                } catch (InputMismatchException ex) {
                    System.out.println("Erro: Os valores para calculo devem ser númericos!");
                    scanner.nextLine(); // LIMPEZA OBRIGATÓRIA: Remove a letra que causou o erro
                    continuar = true;   // Garante que o loop vai rodar de novo
                }
            } while (continuar);

            scanner.close();

        }

        // Continuar o programa ou não
        public static boolean verificarOperacao() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Realizar nova operação ? (S ou N): ");
            return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
        }

        // Calculo
        public static Double calculo(Double valor1, Double valor2, String operacao) {
            double respostaCalculo = 0.0;

            switch (operacao) {
                case "+":
                    respostaCalculo = valor1 + valor2;
                    break;
                case "-":
                    respostaCalculo = valor1 - valor2;
                    break;
                case "*":
                    respostaCalculo = valor1 * valor2;
                    break;
                case "/":
                    respostaCalculo = valor1 / valor2;
                    break;
                case "%":
                    respostaCalculo = valor1 * valor2 / 100;
                    break;
                default:
                    System.out.println("Operação inválida");
            }
            return respostaCalculo;
        }
    }
}
