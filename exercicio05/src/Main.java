import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = 0;
        int a = sc.nextInt();
        int quant = sc.nextInt();
        switch (a){
            case 1:
                valor = 4.00;
                break;
            case 2:
                valor = 4.50;
                break;
            case 3:
                valor = 5.00;
                break;
            case 4:
                valor = 2.00;
                break;
            case 5:
                valor = 1.50;
                break;
            default:
                System.out.println("Valor nao encontrado");
        }
        double resul = valor * quant;

        System.out.printf("Total: R$%.2f",resul);

    }
}