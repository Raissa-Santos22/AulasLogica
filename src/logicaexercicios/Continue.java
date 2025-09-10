package logicaexercicios;

public class Continue {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            if (i % 3 == 0) {
                continue; // Pula os múltiplos de 3
            }
            System.out.println(i);
        }
        }
    }

