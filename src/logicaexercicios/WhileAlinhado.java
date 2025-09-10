package logicaexercicios;

public class WhileAlinhado {
    public static void main(String[] args) {
        System.out.println("Tabuada do 1 ao 10");
        int i = 1;
        while(i <= 10){
            int j = 0;
            while (j <= 10){
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            System.out.println();
            i++;
        }

    }

}
