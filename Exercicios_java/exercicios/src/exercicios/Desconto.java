// Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas 
// oferecendo desconto. Faça um algoritmo que possa receber um valor de um produto e que escreva 
// o novo valor tendo em vista que o desconto foi de 9%. 

package exercicios;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	double produto, desconto;
	
	System.out.println("Valor do produto: ");
	produto = sc.nextDouble();
	
	desconto = produto - (produto * 0.09);
	
	System.out.printf("O valor ficou de %.2f para %.2f%n", produto, desconto);
		

	}

}
