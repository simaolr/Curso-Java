package fundamentos;

public class DesafiosAritmetricos {
	public static void main(String[] args) {
		
		int a =  2 + 3 * 4;
		int b = (int) Math.pow(a, 3);
		
		/* ( [6*(3+2)]²/3*2 - ((1-5)*(2-7)/2)² )³ /10³
		 * o operador Math.pow consegue elevar um valor a potencia
		 * desejada.
		 */
		
		double x1 = Math.pow(6 * (3 + 2), 2) /(3*2);
		double x2 = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		double x3 = (int) Math.pow(x1 - x2, 3) / Math.pow(10, 3);
		System.out.println(x3);
		
		
	}
}
