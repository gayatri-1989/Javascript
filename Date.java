import java.time.*;
import java.time.format.*;

public class Date
{
    public static void main(String[] args) 
    {
        LocalDate dt= LocalDate.now();
        //System.out.println(dt);
        //LocalTime tm=LocalTime.now();
        //System.out.print(tm);

        DateTimeFormatter ft=DateTimeFormatter.ofPattern("dd-MM-yy");
        String formatdt=dt.format(ft);
        System.out.println(formatdt);
    }
}