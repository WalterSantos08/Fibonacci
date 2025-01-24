/*Escreva um programa que receba um número inteiro n e imprima os n primeiros números da 
 * sequência de Fibonacci.*/

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("digite um numero");
		int numero = scanner.nextInt();
		
		if (numero <=1) {
			System.out.println("insira um número maior que 0.");
		}else {
			int primeiro = 1;
			int segundo = 1;
			
			System.out.println("os " + numero + " primeiros numeros de sequencia fibonacci são");
			
			for (int n = 0; n < numero; n++) {
				System.out.println(primeiro + " ");
				
				int proximo = primeiro + segundo;
				primeiro = segundo;
				segundo = proximo;
			}
			
		}
		
		

	scanner.close();
	}

}
