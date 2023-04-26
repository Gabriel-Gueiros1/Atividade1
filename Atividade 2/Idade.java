import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, maisVelho = 0, maisNovo = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            idade = scanner.nextInt();

            if (i == 1) {
                maisNovo = idade;
                maisVelho = idade;
            } else {
                if (idade < maisNovo) {
                    maisNovo = idade;
                }
                if (idade > maisVelho) {
                    maisVelho = idade;
                }
            }
        }

        System.out.println("A idade mais nova é: " + maisNovo);
        System.out.println("A idade mais velha é: " + maisVelho);
    }
}
