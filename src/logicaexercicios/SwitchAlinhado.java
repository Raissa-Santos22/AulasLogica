package logicaexercicios;
import java.util.Calendar;
import java.util.Scanner;
public class SwitchAlinhado {
    public static void main(String[] args) {
        int categoria;
        int subopcao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Categoria");
        System.out.println("Digite uma opcao : ");
        categoria = sc.nextInt();
        switch (categoria){
            case 1 -> System.out.println("Pizza");
            case 2 -> System.out.println("Pastel");
            case 3 -> System.out.println("Esfira");
        }

        System.out.println("Subpocao");
        System.out.println("Digite uma subopção");
        subopcao = sc.nextInt();

        switch (subopcao){
            case 1 -> System.out.println("Presunto e queijo");
            case 2 -> System.out.println("Frango");
            case 3 -> System.out.println("Calabresa");
        }
    }
}
