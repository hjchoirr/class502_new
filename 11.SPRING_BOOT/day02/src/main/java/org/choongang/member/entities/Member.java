package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

@Builder
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Table(name="CH_MEMBER")
//@Table(indexes = {
//        @Index(name="idx_created_at_desc", columnList = "createdAt DESC"),
//        @Index(name="uq_email_password", columnList = "email, password", unique=true)
//    })
public class Member extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;

    @Column(length = 60, nullable = false, unique = true)
    private String email;

    @Column(length = 65, nullable = false)
    private String password;

    @Column(length = 40, nullable = false)
    private String userName;
    //@Lob
    @Transient
    private String introduction;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Authority authority;

    //@Temporal(TemporalType.DATE) //날짜만
    //private Date date;
}
