import java.util.Scanner;
 
 public class Media {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2*2 + nota3*3)/6;
        char conceito;
    
        if (media>=90) {
            conceito = 'A';
        } else if (media>= 75) {
             conceito = 'B';
        }  else if (media>=60){
             conceito = 'C';
        } else if (media>= 40){
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.println("Media final" + media);
        System.out.println("Conceito final " + conceito);

        if ( conceito == 'A' & conceito == 'B' & conceito == 'C' ) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        entrada.close();

    }



}
