
import java.util.Scanner;

public class Main{

    public static double coneVolume(double dValue, double hValue) {
        double r = dValue / 2.0;

        double volume = (1.0 / 3.0) * Math.PI * r * r * hValue;

        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        double diameter = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double volume = coneVolume(diameter, height);

        System.out.printf("Volume: %.2f%n", volume);

        input.close();
    }
}
