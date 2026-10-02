//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        long b = a + 1;
        long c = a +1L;
        System.out.printf("a = %,d, b = %,d, c = %,d\n", a, b, c);
    }
}