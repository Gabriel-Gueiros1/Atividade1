import java.util.Scanner;

public class Parimpar {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int resto,num1; 

        System.out.println("digite um numero");
        num1 = scanner.nextInt();


        resto = num1 % 2 ;

        if (resto == 0){
            System.out.println("numero é par");
        }
        else {
            System.out.println("numero é impar");
        }

    }
}
