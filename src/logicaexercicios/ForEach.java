package logicaexercicios;

// Exercício 8

public class ForEach {
    public static void main(String[] args) {
        int[] notas = {6, 7, 9};
        int soma = 0;

        for (int i = 0; i < notas.length ; i++) {
            soma += notas[i];
        }

        double media = (double) soma/ notas.length;

        System.out.println("A média da soma das notas é igual a : " + media);

    }
}

