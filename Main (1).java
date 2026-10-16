import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();

        double average = (score1 + score2 + score3) / 3.0;

        System.out.printf("%.0f%n", average);
        System.out.printf("%.2f%n", average);
    }
}