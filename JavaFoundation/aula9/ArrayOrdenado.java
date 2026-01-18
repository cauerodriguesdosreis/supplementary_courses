package aula9;

import java.util.Arrays;

public class ArrayOrdenado {
    public static void main(String[] args) {
        // Exemplos de Arrays
        String[] nomes = {"Daniel", "Hugo", "Gabriel", "Igor", "Cauê", "Heitor"};
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int[] numeros = {9, 2, 6, 7, 5, 3, 4, 8, 1, 0};
        float[] notas = {7.6f, 8.5f, 2.7f, 5.4f, 3.6f, 4.3f};

        // Rotina para ordenar os arrays
        Arrays.sort(numeros);
        Arrays.sort(notas);
        Arrays.sort(vogais);
        Arrays.sort(nomes);
        System.out.println("\nNomes: ");
        for (String nome : nomes) {
            System.out.print(nome + ", ");
    }
        System.out.println("\nVogais: ");
        for (char vogal : vogais) {
            System.out.print(vogal + ", ");
        }

        System.out.println("\nNumeros: ");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
        System.out.println("\nNotas: ");
        for (float nota : notas) {
            System.out.print(nota + ", ");
        }

    }
}
