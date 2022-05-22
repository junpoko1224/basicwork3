import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;


public class Work4{
    
    public static void main(String[] args){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        LocalDateTime ltime = LocalDateTime.now();
        String time = f.format(ltime);
        IntStream stream = IntStream.range(1,10000);
        System.out.println(time);
        stream.forEach(System.out::println);
    }   
}