import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //chuyển đổi dữ liệu từ String -> LocalDatetime
        String toDayString = "02/10/2022 18:40";
        LocalDateTime toDay = LocalDateTime.parse(toDayString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println("Ngày hôm này là: "+ toDay);
        //In ra ngày giờ hiện tại
        System.out.println("Ngày giờ hiện tại: "+ LocalDateTime.now());
        //In ra thời gian của 3 ngày sau
        System.out.println("thời gian 3 ngày sau: "+ LocalDateTime.now().plusDays(3));
    }
}