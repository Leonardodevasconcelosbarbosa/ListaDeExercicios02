package exercicios;

import java.util.Scanner;

public class MediaHarmonica {
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o primerio numero");
		 float numero01 = sc.nextFloat();
		 System.out.println("Digite o segundo numero");
		 float numero02 = sc.nextFloat();
		 System.out.println("Digite o terceiro numero");
		 float numero03 = sc.nextFloat();
		 
		 float mediaHarmonica = 3 / ((1/numero01)+(1/numero02)+(1/numero03));
		 System.out.println("A media Harmonica é:"+mediaHarmonica);
		 
		 
		 
		 sc.close();
	}

}
