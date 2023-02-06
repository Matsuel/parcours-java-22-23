import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime==null){
            return null;
        }
        String[] months={"janvier","fevrier","mars","avril","mai","juin","juillet","août","septembre","octobre","novembre","decembre"};
        String date="";
        date+= "Le "+dateTime.getDayOfMonth()+" "+months[dateTime.getMonthValue()-1]+" de l'an "+dateTime.getYear()+" à "+dateTime.getHour()+"h"+dateTime.getMinute()+"m et "+dateTime.getSecond()+"s";
        return date;
    }

    public static String formatSimple(LocalDate date) {
        if (date==null){
            return null;
        }
        String simple="";
        simple+=date.getMonth()+" "+date.getDayOfMonth()+" "+date.getYear()%100;
        return simple;
    }

    public static String formatIso(LocalTime time) {
        if (time==null){
            return null;
        }
        String date="";
        date+=time.getHour()+":"+time.getMinute()+":"+time.getSecond()+"."+time.getNano();
        return date;
    }

}