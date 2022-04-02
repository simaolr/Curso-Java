package fundamentosOperadores;

public class Relacionais {
	public static void main(String[] args) {
		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 4);
		System.out.println(3 <= 4);
		System.out.println(3 != 7);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		
		boolean desconto = bomComportamento && passouPorMedia;
		
		System.out.println("O aluno tem desconto?" 
				+ desconto	);
	}
}
