package logicaexercicios;

import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Digite um número");
            numero = sc.nextInt();
        } while (numero != -1);
        sc.close();
    }

}
