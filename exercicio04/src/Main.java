import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,diferenca;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b){
            diferenca = Math.abs(a - b);
        } else {
            diferenca = 24 - a + b;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)",diferenca);
        sc.close();
    }
}