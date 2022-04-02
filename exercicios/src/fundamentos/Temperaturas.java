package fundamentos;

public class Temperaturas {
	public static void main(String[] args) {
	// (°F-32) x 5/9 = °C
		double F = 86;
		final double G = 32;
		final double V = 5/9.0;

		double C = (F-G) * V;
		
		System.out.println(C);
		
		
	}
}
