import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("첫번째 숫자를 입력하세요 ");
        num1 = keyboard.nextInt();
        System.out.print("두번째 숫자를 입력하세요 ");
        num2 = keyboard.nextInt();
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d\n", num1,num2, sum);
    }
}