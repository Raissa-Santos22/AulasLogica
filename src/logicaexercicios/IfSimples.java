package logicaexercicios;

// Exercício 01
import java.util.Scanner;
public class IfSimples {
    public static void main(String[] args) {
        System.out.println("Digite um numero");
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();
        if(numero >= 0){
            System.out.println("Esse número é positivo");
        }else{
            System.out.println("Esse número é negativo");
        }
    }
}

