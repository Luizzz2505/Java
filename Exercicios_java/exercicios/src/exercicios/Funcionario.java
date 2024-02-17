// Fazer um programa que leia o número de um funcionário,seu número 
// de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, 
// mostre o número e o salário do funcionário, com duas casas decimais.

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int numero, horaTrabalho;
	double valorHora, salario;
	
	System.out.println("Número do funcionário: ");
	numero = sc.nextInt();
	System.out.println("Horas trabalhadas: ");
	horaTrabalho = sc.nextInt();
	System.out.println("Valor recebido por hora: ");
	valorHora = sc.nextDouble();
	
	salario = horaTrabalho * valorHora;
	
	System.out.println("NUMBER = " + numero);
	System.out.printf("SALARY = U$ %.2f", salario);
		
		
	}

}
