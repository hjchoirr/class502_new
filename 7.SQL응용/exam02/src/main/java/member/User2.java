package member;
import lombok.Builder;
import lombok.ToString;
import java.time.LocalDateTime;

@Builder @ToString
public class User2 {
    private String userId;
    private String userNm;
    private String email;
    @ToString.Exclude
    private LocalDateTime regDt;
}
