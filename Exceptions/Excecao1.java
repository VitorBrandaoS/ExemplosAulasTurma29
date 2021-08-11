package Exceptions;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = null;
		String novaFrase = null;
		
		try {// ele vai tentar executar uma sequencia de c�didos que est�o dentro da sua estrutura
			novaFrase = frase.toUpperCase();
			
		}catch(NullPointerException e){//Caso tenha algum problema de execu��o, ele chama o catch para resolver
			//Tratamento da exce��o
			System.out.println("\nA frase inicial est� nula, para solucionar o problema, foi lhe atribuido um valor DEFAULT...");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nFrase nova: "+novaFrase);
	}

}
