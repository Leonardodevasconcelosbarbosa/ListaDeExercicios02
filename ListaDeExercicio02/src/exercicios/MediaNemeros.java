package exercicios;
import java.util.Scanner;
public class MediaNemeros {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você deseja inserir? ");
        int quantidade = sc.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
        } else {
            double soma = 0;

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o " + i + "º número: ");
                double numero = sc.nextDouble();
                soma += numero;
            }

            double media = soma / quantidade;
            System.out.println("A média dos números é: " + media);
        }

        sc.close();
    }

}
