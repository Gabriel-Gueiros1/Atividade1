import java.util.Scanner;

public class IntBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String binario = "";

        while (numero > 0) {
            int resto = numero % 2;
            binario = resto + binario;
            numero = numero / 2;
        }

        System.out.println("O número em binário é: " + binario);
    }
}

