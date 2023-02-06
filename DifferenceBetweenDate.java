import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime localTime1, LocalTime localTime2) {
        Duration duration= Duration.between(localTime1.getHour(), localTime2.getHour());
        return duration;
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        Period period = Period.between(date1, date2);
        return period;
    }

    // public static Long numberOfHoursBetweenDateTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
    //     Long long = dateTime1.getHour()- dateTime2.getHour();
    // }

}