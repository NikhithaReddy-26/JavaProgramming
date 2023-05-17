package assignment4;

import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 0; i < n; i++) {
            String[] dates = scanner.nextLine().split(" ");
            LocalDate signupDate = LocalDate.parse(dates[0], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate currentDate = LocalDate.parse(dates[1], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            KYCForm kycForm = new KYCForm(signupDate, currentDate);
            System.out.println(kycForm.getRangeString());
        }
    }
}
