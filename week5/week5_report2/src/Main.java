import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int points;
        String grade;
        String result;

        System.out.print("당신의 JAVA 점수 입력 : ");
        points = keyboard.nextInt();

        grade = points >= 95 ? "A+" :
                (points >= 90 && points < 95 ? "A0" :
                        (points >= 85 && points < 90 ? "B+" :
                                (points >= 80 && points < 85 ? "B0" :
                                        (points >= 75 && points < 80 ? "C+" :
                                                (points >= 70 && points < 75 ? "C0" :
                                                        (points >= 65 && points < 70 ? "D+" :
                                                                (points >= 60 && points < 65 ? "D0" : "F")))))));

        System.out.printf("입력 점수 : %d\n", points);
        System.out.printf("학점 : %s", grade);


    }
}