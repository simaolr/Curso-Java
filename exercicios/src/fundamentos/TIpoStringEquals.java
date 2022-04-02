package fundamentos;

import java.util.Scanner;

public class TIpoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		String s = new String ("2");
		System.out.println("2" == s); //nesse caso ele vai comparar não o conteudo, mas primeiramente o tipo
		System.out.println("2".equals(s)); //aqui ele vai diretamente no conteudo
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		 
		
		//sempre que comparar strings utilizar o EQUALS
	
		
	}
	
}
