package exercicios;

import java.util.Scanner;

public class Ponderada {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da sua primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.println("Digite o valor do peso da sua primeira nota: ");
		int peso1 = sc.nextInt();
		System.out.println("Digite o valor da sua segunda nota: ");
		float nota2 = sc.nextFloat();
		System.out.println("Digite o valor do peso da sua segunda nota: ");
		int peso2 = sc.nextInt();		
		System.out.println("Digite o valor da sua terceira nota: ");
		float nota3 = sc.nextFloat();
		System.out.println("Digite o valor do peso da sua terceira nota: ");
		int peso3 = sc.nextInt();
		float soma = (nota1*peso1+nota2*peso2+nota3*peso3);
		float peso = (peso1+peso2+peso3);
		float mediaPonderada = soma/peso;
		System.out.printf("A media ponderada dos números digitados é: %.1f",mediaPonderada);
		
		
		
		sc.close();
	}

}
