package PolimorfismoInterface;

public class Quadrado extends BaseFigura implements Figuras {
//extende(herança) a classe Basefigura e implementa a interface Figuras
	
	Quadrado(double lado, String nome){
		super(lado,lado,nome);
		nomeClasse = "Quadrado";
		//Argumentos para a superclasse
	}
	@Override
	public double getDiagonal(){//Tem na Interface
		return Math.sqrt(2)*lado1;
	}
	
	
}
