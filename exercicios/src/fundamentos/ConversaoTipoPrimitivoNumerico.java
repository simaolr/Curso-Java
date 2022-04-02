package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		
		double a = 1; // o java vai converter o valor em double sem precisar informar
		
		float b = (float) 1.23456789012345; // precisamos informar onde vai ter uma alteração
			
		System.out.println(a);
		System.out.println(b);
		
		int c = 4; //valores maiores que 127 ou -128 vão apresentar valores estranhos
		byte d = (byte) c; // por mais que deixamos explicito que o valor de C será um byte
		// alguns valores não caberam dentro do byte
		
		
	}
}
