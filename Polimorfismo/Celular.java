package PolimorfismoInterface;

public class Celular extends Telefone{
	
	public Celular() {
		super("Telefone Celular");
	}
	@Override //Sobrescreve o método disca da minha SuperClasse
	public void toca(int codigoToque){
		switch(codigoToque) {
		case 1:
			System.out.println("Tandandantantan...Tandandantantan...");
			break;
		case 2:
			System.out.println("Tururututututu...Tururututututu...");
			break;
			default:
				System.out.println("Tãtãdandantãtãa...Tãtãdandantãtãa...");
		}
	}
	@Override //Sobrescreve o método disca da minha SuperClasse
	public void disca(String numero) {
		System.out.println("\nO número: "+numero+" é um celular...");
	}
	
}
