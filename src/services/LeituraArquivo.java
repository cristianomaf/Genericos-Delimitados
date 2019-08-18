package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class LeituraArquivo {
	private String arquivo;
	private List<Produto>lista = new ArrayList<>();

	

	public LeituraArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getArquivo() {
		return arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}
	public List<Produto> getLista() {
		return lista;
	}
	
	//metodo leitura arquivo
	
	
	public List<Produto> LerArquivo() {
		try(BufferedReader br= new BufferedReader(new FileReader(arquivo))){
			
					
			String linha = br.readLine(); // le alinha do arquivo
			
			while(linha != null) {
				String[] campos = linha.split(",");  // usa virgula para separar os elementos do vetor
				lista.add(new Produto(campos[0],Double.parseDouble(campos[1])));
				linha = br.readLine();  //proxima linha
			}
			
		
		}catch(IOException e){
			System.out.println("Erro: "+ e.getMessage());
			
		}
		return lista; //retorna lista tipo Produto
		
	}

}
