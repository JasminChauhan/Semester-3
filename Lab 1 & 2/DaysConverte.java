import java.util.Scanner;

public class DaysConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int weeks = remainingDaysAfterYears / 7;
        int days = remainingDaysAfterYears % 7;

        System.out.println(totalDays + " days are ");
        System.out.println(years + " year(s), " + weeks + " week(s), and " + days + " day(s).");
    }
}
