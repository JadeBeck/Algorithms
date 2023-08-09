import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //현재 날짜
        LocalDate now = LocalDate.now();

        //형식 지정
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //형식 적용
        String formatedDate = now.format(dateTimeFormatter);

        // 현재 날짜 출력
        System.out.println(formatedDate);
    }
}