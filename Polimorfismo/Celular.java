package PolimorfismoInterface;

public class Celular extends Telefone{
	
	public Celular() {
		super("Telefone Celular");
	}
	@Override //Sobrescreve o m�todo disca da minha SuperClasse
	public void toca(int codigoToque){
		switch(codigoToque) {
		case 1:
			System.out.println("Tandandantantan...Tandandantantan...");
			break;
		case 2:
			System.out.println("Tururututututu...Tururututututu...");
			break;
			default:
				System.out.println("T�t�dandant�t�a...T�t�dandant�t�a...");
		}
	}
	@Override //Sobrescreve o m�todo disca da minha SuperClasse
	public void disca(String numero) {
		System.out.println("\nO n�mero: "+numero+" � um celular...");
	}
	
}
