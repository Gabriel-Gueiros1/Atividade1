import java.util.Scanner;

public class Somaab {
 
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();

        System.out.println("Digite o valor B");
        int b = scanner.nextInt();

        int c;
        String soma;
        if (a > b) {
            c = a + b;
            soma = "A é maior que B. A soma de A e B é ";
        } else {
            c = a * b;
            soma = "B é maior ou igual a A. O produto de A e B é ";
        }

        System.out.println(soma+ c);
    }

    }


