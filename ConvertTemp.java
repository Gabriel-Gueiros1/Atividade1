import java.util.Scanner;
public class ConvertTemp {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura");
        double temperatura = scanner.nextDouble();

        System.out.println("Informe a escala da temperatura: ");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");
        int escalatemp = scanner.nextInt();

        System.out.println("Informe a conversão: ");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Kelvin");
        int conversaotemp = scanner.nextInt();

        double temperaturaConvertida = 0;

        switch (escalatemp){
            case 1: // Celsius
            if (conversaotemp == 1) { // Celsius
                temperaturaConvertida = temperatura;
        }
    
     if (conversaotemp == 2){ // Fahrenheit
                temperaturaConvertida = temperatura *1.8 + 32;
    } else if (conversaotemp == 3){ // Kelvin
                temperaturaConvertida = temperatura + 273;
    }
    break;

          case 2: // Fahrenheit
        if (conversaotemp == 1){ // Celsius 
            temperaturaConvertida = (temperatura - 32)/1.8;
        } else if(conversaotemp == 2) { // Fahrenheit
       temperaturaConvertida = temperatura;
    } else if (conversaotemp == 3) { // Kelvin 
     temperaturaConvertida = (temperatura + 459.67) *5/9;
    }
    break;
        case 3: // Kelvin 
        if (conversaotemp == 1){ // Celsius 
            temperaturaConvertida = temperatura - 273;
        } else if (conversaotemp == 2){ // Fahrenheit
            temperaturaConvertida = temperatura *1.8 - 459.67;
        } else if (conversaotemp == 3) { // Kelvin
            temperaturaConvertida = temperatura;
        }
        break;

        default: 
         System.out.println("Escala de conservão invalida.");
     
    
     System.out.println("A temperatura convertida é: " + temperaturaConvertida);
     scanner.close();
    }
}