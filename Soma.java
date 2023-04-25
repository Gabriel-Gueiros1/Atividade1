import java.util.Scanner;

import javax.print.event.PrintEvent;

public class Soma {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int soma , num1 , num2;

        System.out.println("Digite um numero");

        num1 = scanner.nextInt();
        
        System.out.println("Digite outro numero");
        num2 = scanner.nextInt();

        soma = num1 + num2;
        System.out.println(soma);


    }





}