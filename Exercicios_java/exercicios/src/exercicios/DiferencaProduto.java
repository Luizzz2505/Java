// Fazer um programa para ler quatro valores inteiros A, B, C e D. 
// A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

package exercicios;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int A, B, C, D, diferenca;
	
	System.out.println("DIFERENÇA DOS PRODUTOS");
	System.out.println("Primeiro valor: ");
	A = sc.nextInt();
	System.out.println("Segundo valor: ");
	B = sc.nextInt();
	System.out.println("Terceiro valor: ");
	C = sc.nextInt();
	System.out.println("Quarto valor: ");
	D = sc.nextInt();
		
	diferenca = (A * B - C * D);
	
	System.out.println("DIFERENÇA = " + diferenca);
	}

}
