import java.time.LocalDateTime;
import java.util.Date;

public class LocalDateToDate {

    public static void main(String[] args) {
        // 1. LocalDateTime 객체 생성(현재 시간)
        LocalDateTime localDateTime = LocalDateTime.now();
        // 2. LocalDateTime -> Date 변환
        Date date = java.sql.Timestamp.valueOf(localDateTime);
        // 3. LocalDateTime, Date 결과 출력
        System.out.println(localDateTime); // 2021-06-20T21:45:14.172849300
        System.out.println(date); // 2021-06-20 21:45:14.1728493
        

    }
}
