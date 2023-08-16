import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        
        // 현재 날짜 구하기
        LocalDate now = LocalDate.now();
 
        // 포맷 정의
        int year = now.getYear();
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM");
        int day = now.getDayOfMonth();
 
        // 포맷 적용
        String formatedMonth = now.format(monthFormatter);
 
        // 결과 출력
        System.out.println(year);
        System.out.println(formatedMonth);
        System.out.println(day);
    }
}