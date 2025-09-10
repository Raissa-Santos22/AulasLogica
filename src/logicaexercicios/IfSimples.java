package logicaexercicios;

import java.util.Scanner;

public class IfSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        int numero;
        numero = sc.nextInt();
        if(numero > 0 ){
            System.out.println("Numero positivo");
        }else{
            System.out.println("Numero negativo");
        }
    }
}
