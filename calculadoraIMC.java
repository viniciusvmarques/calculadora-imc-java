package calculadoraIMC;

import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(peso, altura);
        double imc = pessoa.calcularIMC();
        String classificacao = pessoa.classificarIMC();

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
