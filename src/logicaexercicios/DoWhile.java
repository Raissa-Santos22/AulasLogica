package logicaexercicios;

import java.util.Scanner;

// Exercício 6

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Digite um numero :");
            num = sc.nextInt();
        } while (num != -1) ;
        sc.close();
    }
}

