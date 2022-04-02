package fundamentosOperadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1 
		a--; //a = a - 1
		
		++b; //b = b + 1
		--b; //b = b - 1
		
		/* 
		 * O java vai ler primeiramente o que vem da esquerda para a direita
		 * nesses casos podemos perceber que por mais que as operações
		 * sejam as mesmas, o resultado pode mudar se comparadas.
		 * A importância disso é que o programador entenda que ele sempre
		 * vai precisar otimizar seu código, com menos linhas ser
		 * direto ao onde quer chegar e sempre tomar cuidado com pequenos erros
		 */
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(++a == b--); //a operação realziada é Soma +1 a "a" e depois compara com o valor "b", nisso o valor é igual, e depois é diminuido 1 do "b"
		
		
	}

}
