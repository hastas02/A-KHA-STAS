import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        final int heart = 65;
        final int dayofyear = 365;

        System.out.print("몇년 동안 사셨습니까? ");
        age = keyboard.nextInt();

        int day = age * dayofyear;
        int hour = day * 24;
        long minute = hour * 60L;
        long count = minute * heart;

        System.out.printf("사람은 평균 분당 %d회 심장이 박동한다. \n", heart);
        System.out.printf("%d년 동안 박동한 회수는 %,d 입니다. \n", age, count);



    }
}