// Fazer um programa para ler o código de uma peça 1, 
// o número de peças 1, o valor unitário de cada peça 1, o
// código de uma peça 2, o número de peças 2 e o 
// valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CodigoPeca {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);	
	
	int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
	double valorUnitario1, valorUnitario2, valorPagar;
	
	System.out.println("código da peça 1: ");
	codigoPeca1 = sc.nextInt();
	System.out.println("Números de peça: ");
	numeroPeca1 = sc.nextInt();
	System.out.println("Valor da peça 1: ");
	valorUnitario1 = sc.nextDouble();
	
	System.out.println("código da peça 2: ");
	codigoPeca2 = sc.nextInt();
	System.out.println("Números de peça: ");
	numeroPeca2 = sc.nextInt();
	System.out.println("Valor da peça 2: ");
	valorUnitario2 = sc.nextDouble();
	
	valorPagar = (numeroPeca1 * valorUnitario1) + (numeroPeca2 * valorUnitario2);
	
	System.out.printf("VALOR A PAGAR = R$ %.2f" , valorPagar);
	
	}

}
