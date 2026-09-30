import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double temp_cel;
        System.out.print("섭씨 온도 입력하세요 예'24.5' ");
        temp_cel = keyboard.nextDouble();
        double temp_far = temp_cel * 9.0/5 + 32;
        System.out.printf("섭씨 온도는 %.1f입니다\n", temp_cel);
        System.out.printf("화씨 온도는 %.1f입니다\n", temp_far);
    }
}