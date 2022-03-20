package fundamentos;

import java.util.Scanner;

public class console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); // criando uma forma de receber uma entrada a partir do que se digita no Console
		
		System.out.print("Digite seu nome");
		
		var nome =  entrada.nextLine(); //criando uma variavel onde vai interagir com a informação que for mostrada no console
		
		System.out.println("Nome = " + nome);
		
		entrada.close();
		
		Scanner teclado = new Scanner(System.in);
		 
		System.out.println("Qual a sua idade?");
		int idade = teclado.nextInt();
		System.out.println("Qual o seu nome?");
		string nome = teclado.nextLine();
		System.out.println("Qual o seu sobrenome?");
		string sobrenome = teclado.nextLine();
		 
		teclado.close();
	}

}
