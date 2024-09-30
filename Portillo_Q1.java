import java.util.Scanner;

public class Portillo_Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input of the Student information 
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Number of Units (Maximum 10): ");
        int numberOfUnits = scanner.nextInt();

        
        if (numberOfUnits > 10) {
            System.out.println("The maximum number of units is 10.");
            return;
        }

        // Calculate the total enrollment fee
        int feePerUnit = 1000;
        int totalFee = numberOfUnits * feePerUnit;

       
        System.out.println("\n--- Enrollment Details ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Enrollment Fee: P" + totalFee);

        // payment input
        System.out.print("\nEnter Payment Amount: P");
        int payment = scanner.nextInt();

        // This are outputs
        if (payment == totalFee) {
            System.out.println("Fully Paid");
        } else if (payment < totalFee) {
            System.out.println("Partial Payment");
            System.out.println("Amount Paid: " + payment);
            System.out.println("Remaining Balance: " + (totalFee - payment));
        } else {
            System.out.println("Overpaid! Please check the amount.");
        }

        scanner.close();
    }
}
