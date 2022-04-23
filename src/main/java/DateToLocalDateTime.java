import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateTime {
    public static void main(String[] args) {
// 1. Date 객체 생성 (현재날짜)
        Date date = new Date();
// 2. Date -> LocalDate
        LocalDate localDate = date.toInstant() // Date -> Instant
                .atZone(ZoneId.systemDefault()) // Instant -> ZonedDateTime
                .toLocalDate(); // ZonedDateTime -> LocalDate
// 3. Date -> LocalDateTime
        LocalDateTime localDateTime = date.toInstant() // Date -> Instant
                .atZone(ZoneId.systemDefault()) // Instant -> ZonedDateTime
                .toLocalDateTime(); // ZonedDateTime -> LocalDateTime
// 4. Date, LocalDate, LocalDateTime 출력
        System.out.println(date); // Sun Jun 20 21:09:20 KST 2021
        System.out.println(localDate); // 2021-06-20
        System.out.println(localDateTime); // 2021-06-20T21:09:20.461
    }
}
