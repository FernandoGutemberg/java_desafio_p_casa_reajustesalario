package fundamentos;

import java.util.Scanner;

public class SalarioColaborador {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Recebendo o salário do colaborador
		System.out.print("Digite o salário do colaborador: ");
		double salario = scanner.nextDouble();

		// Calculando o reajuste de acordo com as faixas salariais
		double percentualAumento;
		if (salario <= 280.00) {
			percentualAumento = 0.20;
		} else if (salario <= 700.00) {
			percentualAumento = 0.15;
		} else if (salario <= 1500.00) {
			percentualAumento = 0.10;
		} else {
			percentualAumento = 0.05;
		}

		// Calculando o valor do aumento
		double aumento = salario * percentualAumento;

		// Calculando o novo salário após o aumento
		double novoSalario = salario + aumento;

		// Calculando o valor do aumento real, descontando a inflação
		double inflacao = 0.038;
		double aumentoReal = aumento - (aumento * inflacao);

		// Exibindo os resultados na tela
		System.out.println("Salário antes do reajuste: R$" + salario);
		System.out.println("Percentual de aumento aplicado: " + (percentualAumento * 100) + "%");
		System.out.println("Valor do aumento: R$" + aumento);
		System.out.println("Novo salário após o aumento: R$" + novoSalario);
		System.out.println("Valor do aumento real, descontada a inflação: R$" + aumentoReal);

	}

}
