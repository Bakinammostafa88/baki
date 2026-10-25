import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int largest = 0;
        int smallest = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (count == 0) {
                largest = number;
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
                        sum = sum + number;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Largest = " + largest);
            System.out.println("Smallest = " + smallest);
            System.out.println("Average = " + average);
        }
    }
}



