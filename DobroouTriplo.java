import java.util.Scanner;

public class DobroouTriplo {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
    
        int resultado;
        if (numero >= 0){
            resultado = numero *2;
        } else {
            resultado = numero *3;
        }
    
        System.out.println("O resultado é " + resultado);
    
    }
}
