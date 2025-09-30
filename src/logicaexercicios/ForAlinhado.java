package logicaexercicios;

// Exercício 7

public class ForAlinhado {
    public static void main(String[] args) {
        for (int i = 0; i <= 5 ; i++) {
            for (int j = 0; j <= 5 ; j++) {
                System.out.printf("%d x %d = %d  ", i, j, i * j);
                System.out.println();
            }
            System.out.println();
        }
    }
}

