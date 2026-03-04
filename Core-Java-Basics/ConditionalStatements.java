import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // if-else ladder
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }

        // switch statement
        System.out.print("Enter a number (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Option 1");
                break;
            case 2:
                System.out.println("You selected Option 2");
                break;
            case 3:
                System.out.println("You selected Option 3");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}