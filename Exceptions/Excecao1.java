package Exceptions;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null;
		String novaFrase = null;
		
		try {// ele vai tentar executar uma sequencia de códidos que estão dentro da sua estrutura
			novaFrase = frase.toUpperCase();
			
		}catch(NullPointerException e){//Caso tenha algum problema de execução, ele chama o catch para resolver
			//Tratamento da exceção
			System.out.println("\nA frase inicial está nula, para solucionar o problema, foi lhe atribuido um valor DEFAULT...");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nFrase nova: "+novaFrase);
	}

}
