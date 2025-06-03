package exercicios;

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        
        numero = Math.abs(numero);

        int soma = 0;
        int temp = numero;

        while (temp > 0) {
            int digito = temp % 10; 
            soma += digito;         
            temp = temp / 10;       
        }

        System.out.println("A soma dos dígitos de " + numero + " é: " + soma);

        sc.close();
    }
}