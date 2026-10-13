import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int total;
        System.out.print("판매금액은 ? ");
        total = keyboard.nextInt();
        int tax = (int) (total / 1.1 * 0.1);
        int price = total - tax;
        System.out.printf("판매금액 : %,d원\n", total);
        System.out.printf("금액 : %,d원\n", price);
        System.out.printf("세금 : %,d원\n", tax);


    }
}