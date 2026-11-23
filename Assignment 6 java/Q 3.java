import java.util.Scanner;

class ArrayStatistics {
    private float maxValue;
    private float minValue;

    public float getMaxValue() {
        return maxValue;
    }

    public float getMinValue() {
        return minValue;
    }

    public void findMaxMin(float[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        maxValue = values[0];
        minValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        float[] arr = new float[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextFloat();
        }

        ArrayStatistics stats = new ArrayStatistics();
        stats.findMaxMin(arr);

        System.out.println("Maximum value: " + stats.getMaxValue());
        System.out.println("Minimum value: " + stats.getMinValue());

        input.close();
    }
}