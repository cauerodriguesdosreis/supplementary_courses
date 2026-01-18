package aula6;

import java.util.Scanner;

public class MeiaArraysEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[][] numeros = new int [3][5];
		double media = 0;
		
		System.out.println("Olá!");
		System.out.println("Informe o valor de cada posição da matriz: ");
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print("Elemento [" + (i+1) + "][" + (j+1) + "]: ");
				numeros[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("|");
		System.out.println("Matriz completa:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Linha " + (i+1) + ": ");
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("|");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Soma da linha " + (i+1) + ": \n");
			for (int j = 0; j < numeros[i].length; j++) {
				media = (i += i) / numeros.length - 1;
			}
		}
		
		sc.close();
		            

	}

}
