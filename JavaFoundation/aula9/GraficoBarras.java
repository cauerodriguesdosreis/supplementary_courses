package aula9;

import java.util.Iterator;

public class GraficoBarras {

	public static void main(String[] args) {
		// int[] ExemploUm = {87, 68, 33, 100, 45, 78, 85, 91, 76, 7};
		// Uma nota 100, 1 nota no intervalo 90, 2 notas no intervalo 80, 2 notas no intervalo 70
		// Uma n
		
		int[] frequencia = {1, 0, 1, 1, 0, 1, 2, 2, 1, 1, 0};
		
		System.out.println("Distribuição das Notas\n");
		
		
		// Para cada elemento do array, gera uma saída de uma barra do gráfico
		for (int vcontador = 0; vcontador < frequencia.length; vcontador++) {
			if (vcontador == 10) {
				System.out.printf("%d:", 100);
			}
			else {
				System.out.printf("%02d-%02d:", vcontador * 10, (vcontador * 10) + 9);
			}
			
			for (int estrela = 0; estrela < frequencia[vcontador]; estrela++) {
				System.out.printf("*");
			}
			System.out.println();
		}

}
}
