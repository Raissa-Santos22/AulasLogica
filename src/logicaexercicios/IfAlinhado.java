package logicaexercicios;

public class IfAlinhado {
    public static void main(String[] args) {
        int nota = 9;
        int frequencia = 95;
        if(nota >= 7){
            if (frequencia >= 75){
                System.out.println("Aluno aprovado");
            }else{
                System.out.println("Reprovado por frequencia");
            }
        }else {
            System.out.println("Reprovado por nota");
        }
    }
}

