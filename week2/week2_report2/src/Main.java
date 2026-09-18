import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("원의 반지름 : ");
        int radius = keyboard.nextInt();
        double boxArea = (radius * 2) * (radius * 2);
        double circleArea = radius * radius * 3.141592;
        double area = boxArea - circleArea;
        System.out.printf("정사각형 면적 : %.0f Cm2\n", boxArea);
        System.out.printf("원의 면적 : %.2f Cm2\n", circleArea);
        System.out.printf("구하는 면적 : %.2f Cm2\n", area);
    }
}