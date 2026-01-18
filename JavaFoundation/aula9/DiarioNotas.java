package aula9;

public class DiarioNotas {

    private String NomeDoCurso;
    private int[] notas;

    public DiarioNotas(String NomeDoCurso, int[] notas) {
        this.NomeDoCurso = NomeDoCurso;
        this.notas = notas;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.NomeDoCurso = nomeDoCurso;
    }
    public String getNomeDoCurso() {
        return NomeDoCurso;}

    public void processaNotas() {

        exibeNotas();

        System.out.printf("\nA média da classe é %.2f", getMedia());

        System.out.printf("A menor nota é %d\nA maior nota é: %d", getMínimo(), getMáximo());
    }

    public int getMínimo() {
        int notaBaixa = notas[0];
        for (int nota : notas) {
            if (nota < notaBaixa) {
                notaBaixa = nota;
            }
        }
        return notaBaixa;
    }
    public int getMáximo() {
        int notaAlta = notas[0];
        for (int nota : notas) {
            if (nota > notaAlta) {
                notaAlta = nota;
            }
        }
        return notaAlta;
        
    }

    public double getMedia() {
        int soma = 0;
        for (int nota : notas) {
            soma += nota;
        }
        return (double) soma / notas.length;
    }
    public void exibeGraficoBarras() {

        int[] frequencias = new int[11];

        System.out.println("Distribuição das notas:\n");

        for (int nota : notas) {
            ++frequencias[nota / 10];

            // Para cada elemento do array, imprime uma barra no gráfico
            for (int contador = 0; contador < frequencias[nota / 10]; contador++) {
                // Gera saída do rótulo
                if (contador == 10)
                    System.out.printf("%d:", 100);
                else
                    System.out.printf("%02d-%02d:", contador * 10, (contador * 10) + 9);
                for (int estrela = 0; estrela < frequencias[contador / 10]; estrela++) {
                    System.out.printf("*");
                }
                System.out.println();
            }

        }
    }
    public void exibeNotas() {
        System.out.printf("As notas são: \n\n");

        // Gera a saída da nota de cadsa aluno

        for (int aluno = 0; aluno < notas.length; aluno++) {
            System.out.printf("aluno %2d: %3d\n", (aluno + 1), notas[aluno]);
        }

    }

    public static void main(String[] args) {
        DiarioNotas diario = new DiarioNotas("Programação - Java Foundations", new int[] { 8, 7, 9, 10, 8, 6 });
        diario.exibeNotas();
        diario.exibeGraficoBarras();
        diario.processaNotas();

    }

}
