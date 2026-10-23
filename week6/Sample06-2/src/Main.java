import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        final double don = 3.75;
        final int gold = 775000;
        float weight;

        System.out.print("당신의 몸무게는 ? ");
        weight = keyboard.nextFloat();

        int gram = (int) (weight * 1000);
        double donofweight = gram / don;
        double money = donofweight * gold;
        long money1 = (long) money;

        System.out.printf("%.1f Kg = %,d gram\n", weight, gram);
        System.out.printf("%.1f Kg = %,.2f 돈\n ", weight, donofweight);
        System.out.printf("%.1f Kg = %,d 원(금 1돈 가격 = %,d원)\n", weight, money1, gold);

    }
}