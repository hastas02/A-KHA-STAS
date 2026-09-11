import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("원의 반지름 입력(정수형) ? ");
        int radius = keyboard.nextInt();

        double area = 3.141592 * radius * radius;

        System.out.printf("원의 반지름 : %d Cm, 원의 면적 : %.2f \u33a4\n", radius, area);
    }
}