package org.choongang.member.entities;

import lombok.Data;

@Data
public class Member {
    int userNo;
    String email;
    String password;
    String userName;
}
