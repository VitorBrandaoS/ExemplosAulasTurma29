package PolimorfismoInterface;

public abstract class Telefone { // Adiciono a palavra abstract para tornar a minha classe abstrata
	
	private String tipo;
	abstract public void disca(String numero);//Criação de um método abstrato
	abstract public void toca(int numToques);
	
	public Telefone(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
