package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 8.5; //o java entende que essa variavel é decimal
		System.out.println(b);
		
		a = 8; //transforma um inteiro em decimal
		System.out.println(a);
		
		var c = "Texto"; // o java entende que é uma string
		System.out.println(c);
		
		//sendo assim é impossível transformar uma variavel de um tipo em outro, alterando o valor.
		
		c= "Outro Texto";
		System.out.println(c);
		b= 5.5;
		System.out.println(b);
		
		
		
	}
}
