package curso_programacao;

import java.util.Locale;

public class Aula002 {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.3f%n", x); // definir quantas casas decimais meu número vai aparecer
		Locale.setDefault(Locale.US); // esse Locale vai para o debaixo
		System.out.printf("%.2f%n", x);
		System.out.println("Bom dia!");
		System.out.println("RESULTADO = " + x + " metros");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.println("Teste do %n para quebra de linha"); // tive que add o ln para organizar o exercício seguinte
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f de reais", nome, idade, renda);
		
		
		

	}

}
