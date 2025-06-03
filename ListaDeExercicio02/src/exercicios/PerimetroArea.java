package exercicios;

import java.util.Scanner;

public class PerimetroArea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triangulo: ");
		float lado01 = sc. nextFloat();
		System.out.println("Digite o segundo lado do triangulo: ");
		float lado02 = sc. nextFloat();
		System.out.println("Digite o terceiro lado do triangulo: ");
		float lado03 = sc. nextFloat();
		float perimetro = lado01+lado02+lado03;
		System.out.println("Digite o valor da base do triangulo: ");
		float base = sc.nextFloat();
		System.out.println("Digite o valor da altura do triangulo: ");
		float altura = sc.nextFloat();
		float area = base*altura/2;
		System.out.println("O valor do perimetro é: "+perimetro);
		System.out.println("O valor da area é: "+area);
		sc.close();
	}

}
