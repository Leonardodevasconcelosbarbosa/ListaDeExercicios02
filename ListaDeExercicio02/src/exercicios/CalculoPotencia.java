package exercicios;

import java.util.Scanner;

public class CalculoPotencia {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Cálculo de Potência");

	        System.out.print("Digite a base: ");
	        double base = sc.nextDouble();

	        System.out.print("Digite o expoente: ");
	        double expoente = sc.nextDouble();

	        double resultado = Math.pow(base, expoente);

	        System.out.println("Resultado: " + base + " elevado a " + expoente + " é igual a " + resultado);

	        sc.close();
	    }

}
