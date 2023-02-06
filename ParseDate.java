import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate==null){
            return null;
        }
        return(LocalDateTime.parse(stringDate));
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        if (stringDate==null){
            return null;
        }else{
            String[] a = stringDate.split(" ");
            String mounth;
            String m= a[2];
            switch (m){
                case "janvier": mounth="01"; break;
                case "fevrier": mounth="02"; break;
                case "mars": mounth="03"; break;
                case "avril": mounth="04"; break; 
                case "mai": mounth="05"; break;
                case "juin": mounth="06"; break;
                case "juillet": mounth="07"; break;
                case "aout": mounth="08"; break;
                case "septembre": mounth="09"; break;
                case "octobre": mounth="10"; break;
                case "novembre": mounth="11"; break;
                case "decembre": mounth="12"; break;
                default: mounth="00"; break;
            }
            String date="";
            date+= a[3]+"-"+mounth+"-"+a[1];
            LocalDate parsedDate= LocalDate.parse(date);
            return (parsedDate);
        }
    }

    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate==null){
            return null;
        }else{
            String[] split_date = stringDate.split(" ");
            String Date="";
            String time = split_date[3];
            String s_hour = split_date[0];
            String hour;
            if (time.equalsIgnoreCase("soir,")){
                switch (s_hour){
                    case "01": hour="13"; break;
                    case "02": hour="14"; break;
                    case "03": hour="15"; break;
                    case "04": hour="16"; break;
                    case "05": hour="17"; break;
                    case "06": hour="18"; break;
                    case "07": hour="19"; break;
                    case "08": hour="20"; break;
                    case "09": hour="21"; break;
                    case "10": hour="22"; break;
                    case "11": hour="23"; break;
                    default : hour="Invalid"; break;
                }
                Date += hour+":";
            }else{
                Date += s_hour+":";
            }
            Date+=split_date[4]+":"+split_date[7];
            LocalTime parseDate = LocalTime.parse(Date);
            return parseDate;
        }
    }

}