package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
	//informa��es do funcionario
		
	// Tipos N�mericos Inteiros
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 524;
	int id = 56789;
	long pontosAcumulados = 3_234_845_223L;
	
	// Tipos num�ricos reais
	float salario = 11_445.44F;
	double vendasAcumuladas = 2_991_797_103.01;
			
	// Tipo Boleano
	boolean estaDeFerias =  false;
	
	// Tipo caractere
	char status = 'A';

	// Dias de Empresa
	System.out.println(anosDeEmpresa * 365);
	
	// N�meros de viagens
	System.out.println(numeroDeVoos / 2);
	
	// Pontos por real
	System.out.println(pontosAcumulados / vendasAcumuladas);
	System.out.println(id + " GANHA ->" + salario);		
	System.out.println( "O Funcion�rio est� de f�rias?" + estaDeFerias);
	System.out.println("Status:" + status);
	
	}
	
	
}
