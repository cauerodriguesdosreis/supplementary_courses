package aula8;


public class ArrayDuasDimensões {

	public static void main(String[] args) {
		
		int[][]matriz = new int[3][3];
		
		matriz[0][0] = 120;   matriz[0][1] = 232;   matriz[0][2] = 201;     matriz[1][0] = 129;  matriz[1][1] = 111;    matriz[1][2] = 187;   matriz[2][0] =128;    matriz[2][1] = 247;    matriz[2][2] = 123;
		
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			System.out.print(matriz[i][j]);
			
			if (i < matriz.length - 2) {
				System.out.print(", ");
			}
			
			else if (i < matriz.length - 1) {
				System.out.print(" e ");
			}
			
			else {
				System.out.print(".");
			}
		}
	}
	
	}

	

	
}


