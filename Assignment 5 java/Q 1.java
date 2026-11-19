import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[6];[cite: 1]

        System.out.print("Enter 6 numbers: ");[cite: 1]
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();[cite: 1]
        }

        System.out.print("Reverse: ");[cite: 1]
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        
        int evenSum = 0;
        int greaterCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenSum += nums[i];
            }
            if (nums[i] > nums[0]) {
                greaterCount++;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);[cite: 1]
        System.out.println("Greater than the first number: " + greaterCount);[cite: 1]
        
        in.close();
    }
}https://www.onlinegdb.com/online_java_compiler#tab-stderr