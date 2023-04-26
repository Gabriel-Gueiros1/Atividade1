import java.util.Scanner;

public class Categoriacarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de rodas do veículo: ");
        int qtdRodas = sc.nextInt();

        System.out.print("Digite o peso bruto do veículo em kg: ");
        double pesoBruto = sc.nextDouble();

        System.out.print("Digite a quantidade de pessoas no veículo: ");
        int qtdPessoas = sc.nextInt();

        String categoria = "";

        if (qtdRodas == 2 || qtdRodas == 3) {
            categoria = "Categoria A";
        } else if (qtdRodas == 4 && qtdPessoas <= 8 && pesoBruto <= 3500) {
            categoria = "Categoria B";
        } else if (qtdRodas >= 4 && pesoBruto > 3500 && pesoBruto <= 6000) {
            if (qtdPessoas <= 8) {
                categoria = "Categoria C";
            } else {
                categoria = "Categoria D";
            }
        } else if (qtdRodas >= 4 && pesoBruto > 6000) {
            categoria = "Categoria E";
        } else {
            categoria = "Não foi possível determinar a categoria";
        }

        System.out.println("A categoria necessária para dirigir/pilotar o veículo é: " + categoria);

        sc.close();
    }
}
