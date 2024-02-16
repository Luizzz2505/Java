// Faça um algoritmo que leia quatro números informados pelo usuário e que 
// depois imprima a média ponderada, sabendo­se que os pesos são respectivamente: 1, 2, 3 e 4

package exercicios;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	double n1, n2, n3, n4, media;
	
	System.out.println("Cálculo de média ponderada");
	System.out.println("Número 1: ");
	n1 = sc.nextDouble();
	System.out.println("Número 2: ");
	n2 = sc.nextDouble();
	System.out.println("Número 3: ");
	n3 = sc.nextDouble();
	System.out.println("Número 4: ");
	n4 = sc.nextDouble();
		
	media = (n1 * 1) + (n2 * 2) + (n3 * 3) + (n4 * 4) / 10;
	
	System.out.println("A média ponderada dos números informados é: " + media);

	}

}
