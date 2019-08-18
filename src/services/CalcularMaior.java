package services;

import java.util.List;

public class CalcularMaior {
	
	public static <T extends Comparable<T>> T max(List<T>lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista não pode ser vazia");
		}
		T max = lista.get(0);
		for(T item : lista) {
			if(item.compareTo(max)>0) {
				max = item;
			}
		}
		return max;
	}

}
