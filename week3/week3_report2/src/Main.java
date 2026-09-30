import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String school;
        String name;
        int age;
        char sex;
        double height;
        float weight;
        System.out.print("학교는 ? ");
        school = keyboard.nextLine();
        System.out.print("이름은 ? ");
        name = keyboard.nextLine();
        System.out.print("나이는 ? ");
        age = keyboard.nextInt();
        System.out.print("성별은 ? 예'남' ");
        sex = keyboard.next().charAt(0);
        System.out.print("키는 ? ");
        height = keyboard.nextDouble();
        System.out.print("몸무게는 ? ");
        weight = keyboard.nextFloat();
        System.out.printf("학교 : %s\n", school);
        System.out.printf("이름 : %s\n", name);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("성별 : %c\n", sex);
        System.out.printf("신장 : %.1f\n", height);
        System.out.printf("체중 : %.1f\n", weight);

    }
}