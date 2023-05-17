package assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KYCForm {
    private LocalDate signupDate;
    private LocalDate currentDate;
    private LocalDate anniversaryDate;
    private LocalDate minFormDate;
    private LocalDate maxFormDate;

    public KYCForm(LocalDate signupDate, LocalDate currentDate) {
        this.signupDate = signupDate;
        this.currentDate = currentDate;
        this.anniversaryDate = getAnniversaryDate(signupDate, currentDate.getYear());
        this.minFormDate = anniversaryDate.minusDays(30);
        this.maxFormDate = anniversaryDate.plusDays(30).isBefore(currentDate)
                ? anniversaryDate.plusDays(30) : currentDate;
    }

    public LocalDate getAnniversaryDate(LocalDate signupDate, int currentYear) {
        LocalDate anniversaryDate = LocalDate.of(currentYear, signupDate.getMonth(), signupDate.getDayOfMonth());
        if (anniversaryDate.isBefore(signupDate)) {
            anniversaryDate = anniversaryDate.plusYears(1);
        }
        return anniversaryDate;
    }

    public String getRangeString() {
        if (minFormDate.isAfter(currentDate)) {
            return "No range";
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return minFormDate.format(formatter) + " " + maxFormDate.format(formatter);
        }
    }
}
