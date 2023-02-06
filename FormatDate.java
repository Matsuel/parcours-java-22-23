import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        if (dateTime==null){
            return null;
        }
        String[] months={"janvier","fevrier","mars","avril","mai","juin","juillet","août","sep.","oct.","nov.","dec."};
        String date="";
        date+= "Le "+dateTime.getDayOfMonth()+" "+months[dateTime.getMonthValue()-1]+" de l'an "+dateTime.getYear()+" à "+dateTime.getHour()+"h"+dateTime.getMinute()+"m et "+dateTime.getSecond()+"s";
        return date;
    }

    public static String formatSimple(LocalDate date) {
        if (date==null){
            return null;
        }
        String[] months={"gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosoto","settembre","ottobre","novembre","dicembre"};
        String simple="";
        simple+=months[date.getMonthValue()-1]+" "+date.getDayOfMonth()+" "+date.getYear()%100;
        return simple;
    }

    public static String formatIso(LocalTime time) {
        String date="";
        if (time==null){
            return null;
        }else if (time.getNano()==0){
            date+=time.getHour()+":"+time.getMinute()+":"+time.getSecond();
        }else{
            date+=time.getHour()+":"+time.getMinute()+":"+time.getSecond()+"."+time.getNano();
        }
        return date;
    }

}