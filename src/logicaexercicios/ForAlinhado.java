package logicaexercicios;

public class ForAlinhado {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 5;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int valor = i + j;
                System.out.print(valor + "\t"); // "\t" para alinhar em colunas
            }
            System.out.println(); // Quebra de linha após cada linha da matriz
        }
    }
}
