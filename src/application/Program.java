package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import services.CalcularMaior;
import services.LeituraArquivo;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o caminho do arquivo:");
		String camArquivo = scan.next();
		
		List<Produto>lista = new ArrayList<>();	 // criado lista de Produtos
		
		LeituraArquivo novo = new LeituraArquivo(camArquivo); //instaciei Leitura arquivo passando o caminho do mesmo
		lista = novo.LerArquivo();    // a lista criada recebe a o metodo que retorna uma lista de produtos com base no arquivo
				
		Produto x = CalcularMaior.max(lista);  //cria um produto para armazenar o maior
		System.out.println("Max:");      
		System.out.println(x);
		
		
		
		scan.close();

	}

}
