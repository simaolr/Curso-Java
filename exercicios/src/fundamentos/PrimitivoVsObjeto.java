package fundamentos;

import java.util.Scanner;

public class PrimitivoVsObjeto {
	
	public static void main(String[] args) {
		//String s = "texto";
		//s.toUpperCase(); //existem atributos e comportamentos para objetos, quando � criado variavel.
		
		// int a = 123; // por�m existem variaveis que n�o possuem comportamentos.
		
		// Existe uma forma de designar comportamentos aos tipos primitivos que n�o o possuem, atrav�s do Wrapp
		// Wrappers s�o as vers�es objetos dos tipos primitivos
		
		Scanner entrada = new Scanner(System.in);
		
		
		Byte b = 100;
		Short s = 1000;
		
		Integer i = Integer.parseInt(entrada.nextLine());
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		
		entrada Closer
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
	}
}
