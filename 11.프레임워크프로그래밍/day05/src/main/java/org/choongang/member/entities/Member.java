package org.choongang.member.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
//@Table("CH_MEMBER")
public class Member {
    @Id
    //@Column("ID")
    private Long seq;
    private String email;
    @JsonIgnore
    private String password;
    private String userName;
    @JsonFormat(pattern = "yyyyMMdd HH:mm:ss")
    private LocalDateTime regDt;
}
