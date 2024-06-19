package cursojava.executavel;

public class PrimeiraClasseJava {
	
	static int maiorIdadeGlobal = 30;
	
	/*main é um auto executavel*/
	public static void main(String[] args) {
		
		/*Escreve no console*/
		System.out.println("Hello Mundo");
		
		 
		
		/*vareavel local porque pertence somente a esse metodo*/
		int maiorIdade = 18;
		
		System.out.println("Maior idade é igual " + maiorIdade + " anos");
		
		metodo2();
	
	}
	
	public static void metodo2 () {
		
		System.out.println("valor da variavel Global = " + maiorIdadeGlobal );
		
	}
		
} 
			



