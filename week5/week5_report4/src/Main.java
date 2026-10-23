import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int sum;
        char membership;
        String result;

        System.out.print("총 구매 금액을 입력하세요 (예 50000) ");
        sum = keyboard.nextInt();
        System.out.print("멤버십 회원 여부 (O/X) ");
        membership = keyboard.next().charAt(0);

        result = sum <= 0 ? "오류: 잘못된 금액입니다." :
                (sum >= 50000 || (membership == 'O' && sum >= 30000)) ? "무료배송 대상입니다." :
                        "유료배송 대상입니다.";

        System.out.printf("결과: %s\n", result);












    }
}