import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int weight;
        System.out.print("당신의 몸무세는 ? ");
        weight = keyboard.nextInt();
        double moon = weight * 16.5 / 100;
        System.out.printf("당신의 몸무게 : %d kg\n", weight);
        System.out.printf("달에서의 몸무게 : %.2f kg", moon);

    }
}