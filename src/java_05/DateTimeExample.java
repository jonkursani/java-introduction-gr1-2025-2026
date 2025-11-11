package java_05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class DateTimeExample {
    public static void main(String[] args) {
        // Nese doni me gjet daten dhe kohen aktuale te sistemit operativ
        // mundeni me dy klasa
        // per date: LocalDate
        // per date dhe ore: LocalDateTime
        LocalDate data = LocalDate.now();
        System.out.println("Data: " + data);

        LocalDateTime dataDheOra = LocalDateTime.now();
        System.out.println("Data dhe ora: " + dataDheOra);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("Data dhe ora: " + gregorianCalendar.getTime());
        System.out.println("Timezone: " + gregorianCalendar.getTimeZone());
    }
}