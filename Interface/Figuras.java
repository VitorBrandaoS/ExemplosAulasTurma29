package PolimorfismoInterface;

public interface Figuras {//Criação da interface
	public String nomeInterface = "Figuras";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	
	public double getArea();
	public double getPerimetro();
	double getDiagonal();//Quando não tem nada é considerado Public.
	
}
