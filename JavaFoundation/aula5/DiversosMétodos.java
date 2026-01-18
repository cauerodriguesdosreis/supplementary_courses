package aula5;

public class DiversosMétodos {

	public static void main(String[] args) {
		double a = 2.4, b = 2.8, c = 4, d = 1;
		
		System.out.println("Arredondamento de " + a + " = " + Math.round(a));
		System.out.println("Arredondamento de " + b + " = " + Math.round(b));
		System.out.println("Arredondamento de " + c + " = " + Math.round(c));
		System.out.println("Arredondamento de " + d + " = " + Math.round(d));
		System.out.println("|");
		System.out.println("Maior valor entre " + a + " e " + b + " = " + Math.max(a,b));
		System.out.println("Maior valor entre " + a + " e " + c + " = " + Math.max(a,c));
		System.out.println("Maior valor entre " + a + " e " + d + " = " + Math.max(a,d));
		System.out.println("Maior valor entre " + b + " e " + c + " = " + Math.max(b,c));
		System.out.println("Maior valor entre " + b + " e " + d + " = " + Math.max(b,d));
		System.out.println("Maior valor entre " + c + " e " + d + " = " + Math.max(c,d));
		System.out.println("|");
		System.out.println("Menor valor entre " + a + " e " + b + " = " + Math.min(a,b));
		System.out.println("Menor valor entre " + a + " e " + c + " = " + Math.min(a,c));
		System.out.println("Menor valor entre " + a + " e " + d + " = " + Math.min(a,d));
		System.out.println("|");
		System.out.println("O quadrado de " + a +" é: " + Math.pow(a, 2));
		System.out.println("O quadrado de " + b +" é: " + Math.pow(b, 2));
		System.out.println("O quadrado de " + c +" é: " + Math.pow(c, 2));
		System.out.println("O quadrado de " + d +" é: " + Math.pow(d, 2));
		System.out.println("|");
		System.out.println("A raiz quadrada de " + a + " é: " + Math.sqrt(a));
		System.out.println("A raiz quadrada de " + b + " é: " + Math.sqrt(b));
		System.out.println("A raiz quadrada de " + c + " é: " + Math.sqrt(c));
		System.out.println("A raiz quadrada de " + d + " é: " + Math.sqrt(d));
		System.out.println("|");
		System.out.println("O valor absoluto de " + a + " é: " + Math.abs(a));
		System.out.println("O valor absoluto de " + b + " é: " + Math.abs(b));
		System.out.println("O valor absoluto de " + c + " é: " + Math.abs(c));
		System.out.println("O valor absoluto de " + d + " é: " + Math.abs(d));

	}

}
