
public class Main {

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    public static void main(String[] args) {

        System.out.println(average(4, 7));

        System.out.println(average(2, 4, 9));

        System.out.println(average(2.5, 3.5));
    }
}

/*
Why can't we declare double average(int x, int y)?

Because it has the same method signature as
average(int a, int b).

Java does not allow two methods with the same name
and the same parameter types, even if their
parameter names or return types are different.
*/
