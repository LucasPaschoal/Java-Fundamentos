import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        int imposto = 0;

        if (salario <= 2000.00) System.out.println("Insento");
        else if (salario > 2000.00 && salario <= 3000.00) imposto = 8;
        else if (salario > 3000.00 && salario <= 4500.00) imposto = 18;
        else imposto = 28;

        double total = salario * imposto / 100;

        if (total != 0) System.out.printf("R$ %.2f",total);
    }
}