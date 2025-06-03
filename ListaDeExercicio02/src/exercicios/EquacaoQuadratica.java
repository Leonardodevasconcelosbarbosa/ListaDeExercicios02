package exercicios;

import java.util.Scanner;

public class EquacaoQuadratica {
	
	public static void main(String[]argas) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor A da Equação Quadrática:");
		float numero01 = sc.nextFloat();
		
		System.out.println("Digite o valor B da Equação Quadrática:");
		double numero02 = sc.nextDouble();
		
		System.out.println("Digite o valor C da Equação Quadrática:");
		float numero03 = sc.nextFloat();
		
	    double delta = Math.pow(numero02, 2.0) - 4*numero01*numero03;
	    System.out.println(delta);
	    if (delta>0) {
	    	System.out.println("Possui duas raízes:");
	    } else if (delta == 0) {
	    		System.out.println("Possui uma raiz:");
	    } else {
	    			System.out.println("Não possui raízes:");
	    			sc.close();
	    }
	  

	}}
