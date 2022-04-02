package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner e1 = new Scanner(System.in);
		
		System.out.print("Informe o número");		
		double n1 = e1.nextDouble();
		
		System.out.print("Informe o número");
		double n2 = e1.nextDouble();
		
		System.out.print("Informe a operação");
		String op = e1.next();
		
		double r= "+".equals(op) ? n1 + n2 : 0;
		r = "-".equals(op) ? n1 - n2 : r;
		r = "*".equals(op) ? n1 * n2 : r;
		r = "/".equals(op) ? n1 / n2 : r;
		r = "%".equals(op) ? n1 % n2 : r;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, r);
		
		e1.close();
	}
	
}
