package PolimorfismoInterface;

public interface Figuras {//Cria��o da interface
	public String nomeInterface = "Figuras";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();//Quando n�o tem nada � considerado Public.
	
}
