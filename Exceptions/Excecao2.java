package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	//Demonstrar o lançamento de uma exceção quando ocorre uma divisão por zero

	public static int quociente(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		boolean continueLoop = true;
		
		do {
			try {// lê dois números e calcula o quociente
				System.out.println("\nEntre com o numerador: ");
				int numerador = ler.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = ler.nextInt();
				
				int resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d",numerador,denominador,resultado);
				continueLoop = false;
			}catch(InputMismatchException inputMismatchException){
				System.err.printf("\nException: %s ", inputMismatchException);
				ler.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro."
						+ "\nPor favor, tente novamente...");
			 
			}catch(ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s", arithmeticException);
				System.out.println("\nzero é um denominador inválido."
						+ "\nPor favor, tente novamente...");
			}
			
		}while(continueLoop);
		
	}

}
