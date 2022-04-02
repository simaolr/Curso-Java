package fundamentos;

public class NotacaoPontos {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.toUpperCase();
		
		System.out.println(s);
		
		var s1 = s.replace("X", "Senhora");
		var s2 = s.concat("!!!");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Lucas".toUpperCase());
		
		String y = "Ola X"
				.replace("X", "Lucas")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não recebem o operador . , então não da para usar
	}
}
