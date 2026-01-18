package aula10;

import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class ArrayBuscaBinaria {

	public static void main(String[] args) {
		int[] n = new int[1000];
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 1000);
			
		}
		
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número entre 1 e 999"));
		String r = "Valor não encontrado!";
		
		System.out.println("Método tradicional - Busca linear");
		for (int i = 0; i < n.length; i++) {
			if (n[i] == valor) {
				r = "Valor foi encontrado na posição: " + i;
				break;
			}
		}
		System.out.println(r);
	
		System.out.println("\nMétodo Busca Binária");
		Arrays.sort(n);
		int posicao = Arrays.binarySearch(n, valor);
		System.out.println("Nova posição ordenada: " + posicao);		
	}

}
