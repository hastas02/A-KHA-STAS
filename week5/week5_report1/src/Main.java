import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        String result;

        System.out.print("3개의 정수를 입력하세요 ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        result = (num1 > 0 && num2 > 0 && num3 > 0) ? "모두 양수" :
                ((num1 < 0 || num2 < 0  || num3 < 0) ? "음수 포함" : "모두 0");
        System.out.println(result);

    }
}