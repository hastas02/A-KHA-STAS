import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 이름은 ? ");
        String name = keyboard.nextLine();

        System.out.printf("%s님의 나이는 ? ", name);
        int age = keyboard.nextInt();

        System.out.printf("이름 : %s, 나이 : %d\n", name, age);
    }
}


