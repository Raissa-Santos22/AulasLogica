package logicaexercicios;

public class SwitchAlinhado {
    public static void main(String[] args) {
        int categoria = 1;
        int subopcoes = 3;

        System.out.println("------ MENU -------------");
        switch (categoria){
            case 1 -> System.out.println("Opção 1 : Pizza");
            case 2 -> System.out.println("Opção 2 : Pastel");
            case 3 -> System.out.println("Opção 3 : Esfirra");
        } switch (subopcoes){
            case 1 -> System.out.println("Sabor : calabresa");
            case 2 -> System.out.println("Sabor : Presunto e queijo");
            case 3 -> System.out.println("Sabor : Frango");
            case 4 -> System.out.println("Sabor : Carne");
        }
    }




}
