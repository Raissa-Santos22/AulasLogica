package logicaexercicios;

public class ForEach {
    public static void main(String[] args) {
        double[] notas = {6, 4, 10, 7};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;

        System.out.println("Média das notas: " + media);

    }

}
