import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int apple;
        int pear;
        int payment;
        final int APPLE = 500;
        final int PEAR = 600;
        int price;
        boolean flag;
        String result;

        System.out.print("구입한 사과 개수 : ");
        apple = keyboard.nextInt();
        System.out.print("구입한 배 개수 : ");
        pear = keyboard.nextInt();
        System.out.print("지불한 금액  : ");
        payment = keyboard.nextInt();

        price = apple * APPLE + pear * PEAR;
        flag = payment >= price;

        result = flag ? String.format("물품 가격 : %,d 원\n지불 금액 : %,d 원\n반환 금액 : %,d 원\n",
                price, payment, payment - price) : "금액이 부족 합니다";

        System.out.println(result);
    }
}