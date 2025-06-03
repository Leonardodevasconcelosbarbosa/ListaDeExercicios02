package exercicios;

import java.util.Scanner;

public class JurosCompostos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do capital inicial: ");
		float capitalInicial = sc.nextFloat();
		System.out.println("digite o valor dos Juros anuais:");
		float jurosAnuais = sc.nextFloat();
		System.out.println("Digite o numero de anos");
		float numeroAnos = sc.nextFloat();
		double valorFinal = capitalInicial*Math.pow(1+jurosAnuais/100,numeroAnos);
		System.out.printf("O Valor do montando final é: %.2f",valorFinal);
		
		sc.close();
	}

}
