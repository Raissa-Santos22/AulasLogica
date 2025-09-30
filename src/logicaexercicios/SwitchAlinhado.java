package logicaexercicios;
import java.util.Calendar;
import java.util.Scanner;
// Exercício 3
public class SwitchAlinhado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int categoria;
        int subopcao;

        System.out.println("---------CATEGORIA ----");
        System.out.println("Digite uma categoria : ");
        categoria = sc.nextInt();
        switch (categoria){
            case 1 -> System.out.println(" Pizza");
            case 2 -> System.out.println(" Pastel");
            case 3 -> System.out.println(" Esfira");
        }
        System.out.println("------SUBOPÇÃO------");
        System.out.println("Digite uma subopcao : ");
        subopcao = sc.nextInt();
        switch (subopcao){
            case 1 -> System.out.println(" Presunto e queijo");
            case 2 -> System.out.println(" Frango");
            case 3 -> System.out.println("-Calabresa");
        }
    }
}

