import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();

        if(b % a == 0 || a % b == 0){
            System.out.println("Sao Multiplos");
        } else System.out.println("Nao sao Multiplos");

        sc.close();
    }
}