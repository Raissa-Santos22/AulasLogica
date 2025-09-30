package logicaexercicios;

// Exercício 2

public class IfAlinhado {
    public static void main(String[] args) {
        double nota = 5;
        int frequencia = 50;
        if(nota >= 7){
            if(frequencia >= 75){
                System.out.println("Aprovado por sua nota e frequencia");
            }
        }
        else{
            System.out.println("Reprovado por frequencia e nota ");
        }

    }
}

