// Faça um programa para ler dois valores inteiros, 
// e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.

package exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int n1, n2, soma;
	
	System.out.println("Número 1: ");
	n1 = sc.nextInt();
	System.out.println("Número 2: ");
	n2 = sc.nextInt();
	
	soma = n1 + n2;
	
	System.out.println("SOMA = " + soma);
		
		

	}

}
