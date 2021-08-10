package PolimorfismoInterface;

public class Fixo extends Telefone {
	public Fixo() {
		super("Telefone Fixo");
	}
	@Override
	public void toca(int numToques){
		for(int i = 0; i < numToques; i++) {
			System.out.println("Dlindon... Dlindon...");
		}
	}
	@Override
	public void disca(String numero) {
		System.out.println("\nDiscando: "+numero);
	}
}
