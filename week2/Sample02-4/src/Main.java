import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 이름은 ? ");
        String name = keyboard.nextLine();

        System.out.printf("%s님의 나이는 ? ", name);
        int age = keyboard.nextInt();

        System.out.printf("%s님의 키는 예 170.5 ? ", name);
        double height = keyboard.nextDouble();

        System.out.printf("%s님의 몸무게 (예 78.6) ? ", name);
        float weight = keyboard.nextFloat();

        System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
        System.out.printf("%s님의 키는 %.1f Cm 입니다.\n", name, height);
        System.out.printf("%s님의 몸무게는 %.1f Kg 입니다.\n", name, weight);
    }
}