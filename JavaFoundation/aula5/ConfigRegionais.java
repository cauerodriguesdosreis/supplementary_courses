package aula5;

import java.util.Locale;
import java.text.DecimalFormat;

public class ConfigRegionais {

	public static void main(String[] args) {
		// Variáveis
		DecimalFormat df = new DecimalFormat();
		Locale local = Locale.getDefault();
		double valor = 1350.80;

		if (local.getCountry().equals("BR")) {
			df.applyPattern("R$ #,##0.00");
		}

		// Saída
		System.out.println("Configurações do sistema operacional: ");
		System.out.println("\nSigla: " + local.getCountry());
		System.out.println("\nPaís: " + local.getDisplayCountry());
		System.out.println("\nIdioma: " + local.getDisplayLanguage());
		System.out.println("\nTecaldo: " + local.getDisplayName());
		System.out.println("\nValor: " + df.format(valor));
	}

}
