import java.util.Scanner;

public class PersonUtil {

    public static String askForFirstName() {
        String firstName;
        do {
            System.out.println("FIRST NAME:");
            firstName = new Scanner(System.in).nextLine();
        } while (firstName.isEmpty());
        return firstName;
    }

    public static String askForLastName() {
        String lastName;
        do {
            System.out.println("LAST NAME:");
            lastName = new Scanner(System.in).nextLine();
        } while (lastName.isEmpty());
        return lastName;
    }

    public static int askForAge() {
        int age;
        do {
            System.out.println("AGE:");
            age = new Scanner(System.in).nextInt();
            if (age <= 0 || age > 120) {
                System.out.println("PLEASE TAKE THIS SERIOUSLY.");
            }
        } while (age <= 0 || age > 120);
        return age;
    }

    public static double askForIncome() {
        double income;
        do {
            System.out.println("MONTHLY INCOME IN USD:");
            income = new Scanner(System.in).nextDouble();
            if (income <= -1 || income > 3000000000.0) {
                System.out.println("PLEASE TAKE THIS SERIOUSLY.");
            }
        } while (income <= -1 || income > 3000000000.0);
        return income;
    }
}