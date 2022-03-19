package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ola Mundo".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s + "!!!!");
		System.out.println(s.startsWith("Boa")); //com isso ele irá verificr se a string colocada corresponde a primeira parte da string 's'
		System.out.println(s.toLowerCase().startsWith("boa")); //ele irá verificar se a string colocada corresponde aos msm caractereste, deixando tudo minusculo antes de checar.
		System.out.println(s.toUpperCase().endsWith("TARDE"); // da mesma forma sendo que no final, além de deixar tudo maiusculo antes
		System.out.println(s.length()); //quantos caracteres existem na variavel
		System.out.println(s.equals("boa tarde"));
		
	}

}
