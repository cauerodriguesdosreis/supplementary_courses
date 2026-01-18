package aula9;

public class ArrayC {

	public static void main(String[] args) {
		// Inicialização do ArrayC
		
		int[] c = new int [12];
		
		c[0] = 12;
		c[1] = 44;
		c[2] = 65;
		c[3] = 90;
		c[4] = 11;
		c[5] = 78;
		c[6] = 90;
		c[7] = 55;
		c[8] = 32;
		c[9] = 101;
		c[10] = 190;
		c[11] = 902;
		
		System.out.printf("%5s%8s", "Índice", "Valor");
		
		for (int i = 0; i < c.length; i++) {
			System.out.printf("\n%3d%9d", (i+1), c[i]);
		}

	}

}
