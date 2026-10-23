import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int time;
        int hours;
        int minutes;
        int seconds;
        int left_time;

        System.out.print("초 입력하세요 ");
        time = keyboard.nextInt();

        hours = time / 3600;
        left_time = time % 3600;
        minutes = left_time / 60;
        seconds = time % 60;

        System.out.printf("%d 초 = %d시간 %d분 %d초", time, hours, minutes, seconds);

    }
}