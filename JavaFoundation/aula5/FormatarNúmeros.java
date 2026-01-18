package aula5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatarNúmeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		DecimalFormat df = new DecimalFormat();
		
		short idade = 38;
	    df.applyPattern("000");
	    System.out.println(df.format(idade));
	    
	    df.applyPattern("###");
	    System.out.println(df.format(idade));
	    
	    int quantidade = 9759;
	    df.applyPattern("0,000");
	    System.out.println(df.format(quantidade));
	    
	    long estoque = 1038764;
	    df.applyPattern("#,##0,000");
	    System.out.println(df.format(estoque));
	    
	    float altura = 1.74f;
	    df.applyPattern("#0.00");
	    System.out.println(df.format(altura));
	    
	    double peso = 70.25;
	    df.applyPattern("#0.00");
	    System.out.println(df.format(peso));
	    
	    double valorEmReais = 2582.78;
	    df.applyPattern("R$ #,##0.00");
	    System.out.println(df.format(valorEmReais));
	    
	    sc.close();
	}

}
