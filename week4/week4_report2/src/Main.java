import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int w, l, h;
        System.out.print("직육면체 가로 세로 높이 입력 : ");
        w = keyboard.nextInt();
        l = keyboard.nextInt();
        h = keyboard.nextInt();
        int vol = w*l*h;
        System.out.printf("직육면체 가로 = %d Cm\n", w);
        System.out.printf("직육면체 세로 = %d Cm\n", l);
        System.out.printf("직육면체 높이 = %d Cm\n", h);
        System.out.printf("직육면체 부피 = %d \u33A4\n", vol);


    }
}