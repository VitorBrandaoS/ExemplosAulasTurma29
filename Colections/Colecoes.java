package Colections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Colecoes {
	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2);//Adicionando o valor 2 na posição 0 e assim sucessivamente
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		
		for(Integer listaElementos: minhaLista) {//Tipo de dado - Variavel de looping - e vai percorrer "minhaLista"
			System.out.println(listaElementos);
		}
		
		System.out.println("\nRemovendo um elemento da lista...");
		System.out.println();
		
		minhaLista.remove(0);//Remove o valor na posição indice da "minhaLista"
		
		for(Integer listaElementos: minhaLista) {//Tipo de dade - Variavel de looping - e vai percorrer "minhaLista"
			System.out.println(listaElementos);
		}
		
		int primeiroElemento = minhaLista.get(0);
		
		System.out.println("\nO primeiro elemento é: "+ primeiroElemento);
		
		System.out.println();
		
		for(int i=0; i< minhaLista.size(); i++) {//size --> verifiva o tamanho do meu ArrayLista
			System.out.println("\nElemento: "+minhaLista.get(i));//Mostra na posição i de acordo com o Array list			
		}
		
		Collections.sort(minhaLista);//O método sort vai ordenar em ordem crescente o meu array list
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();//Criação de um objeto do tipo Set instanciado para o HashSet
		
		meuSet.add(2);
		meuSet.add(1);
		meuSet.add(5);
		meuSet.add(2);
		meuSet.add(5);
		
		//Iterator cria uma modificação dentro do Set, para manipular os elementos e tira os valores duplicados
		Iterator<Integer> iMeuSet = meuSet.iterator();
		//Cria uma variavel do tipo Iterator chamada iMeuSeu
		while(iMeuSet.hasNext()) {//o metodo hasNext percorre todo meu Iterator verificando a posição e no final ele para.
			System.out.println(iMeuSet.next());//next é um gatilho pra ir pro próximo valor do meu Iterator
			
		}
	}
}
