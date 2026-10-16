import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int width;
        int height;
        char type; //작, 정 사각형
        int area;
        boolean flag;

        System.out.print("사각형의 가로 길이 입력 (예 5) : ");
        width = keyboard.nextInt();
        System.out.print("사각형의 새로 길이 입력 (예 5) : ");
        height = keyboard.nextInt();

        type = (width == height) ? '정' : '직';
        area = width * height;

        flag = (width > 0 && height > 0);

        String result = flag ? String.format(
                "**** %c사각형 넓이 ****\n\t가로 길이 : %,d Cm\n\t세로 길이 : %,d Cm\n\t넓이 : %,d \u33A1\n",
                type, width, height, area
        ) : "Data 오류 입니다";

        System.out.println(result);

    }
}