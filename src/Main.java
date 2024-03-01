import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("tipo de consumo ['P' = Peso | 'C' = la carte] = ");
        char tipoConsumo = input.next().charAt(0);
        if(tipoConsumo == 'C'){
            do{
                System.out.println("\nInsira o valor do consumo");
                double valorConsumo = input.nextDouble();
                if(valorConsumo==0)break;
                Consumo consumoCarte = new Consumo(valorConsumo);
                System.out.printf("Valor do Consumo: R$%.1f \nTipo do Cliente: %c", consumoCarte.getValorConta(), consumoCarte.getTipoCliente());
            }while(true);
        }
        else if(tipoConsumo == 'P'){
            do{
            System.out.println("\nInsira o valor do consumo");
            double valorConsumo = input.nextDouble();
            if(valorConsumo==0)break;
            System.out.println("\nInsira o tipo do cliente");
            char tipoCliente = input.next().charAt(0);
            Consumo consumoPeso = new Consumo(valorConsumo, tipoCliente);
            System.out.printf("Valor do Consumo: R$%.1f \nTipo do Cliente: %c", consumoPeso.getValorConta(), consumoPeso.getTipoCliente());
            }while(true);
        }
        input.close();
    }
}