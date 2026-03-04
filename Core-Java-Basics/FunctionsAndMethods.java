public class FunctionsAndMethods {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to check even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {

        int sum = add(10, 20);
        System.out.println("Sum: " + sum);

        int num = 15;
        if (isEven(num)) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
