package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		//essa são as formas normais para transformar um inteiro é string
		//porém uma forma simples de mostrar essa informação an tela pode ser:
		
		System.out.println("" + num1); // ao utilizar as aspas e o simbolo do +
		// você informa que essa variavel se torna uma stirng
	}
}
