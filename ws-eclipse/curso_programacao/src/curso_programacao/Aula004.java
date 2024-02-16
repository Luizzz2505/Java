package curso_programacao;

import java.util.Scanner;

public class Aula004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // sc é a variável
		
		String x;
		int y;
		double z;
		char a;
		x = sc.next(); // String
		y = sc.nextInt(); // int
		z = sc.nextDouble(); // double
		a = sc.next().charAt(0);
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + z);
		System.out.println("Você digitou: " + a);
		sc.close(); // quando não precisar mais do objeto sc
	}

}
