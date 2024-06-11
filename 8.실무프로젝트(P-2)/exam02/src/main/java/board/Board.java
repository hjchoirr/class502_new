package board;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class Board {
    private long seq;
    private String poster;
    private String subject;
    private String content;
    private LocalDateTime reg_dt;
    private LocalDateTime mod_dt;
}
