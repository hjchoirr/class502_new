package com.jmt502.api.member.entities;

import com.jmt502.api.member.constants.Authority;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class AuthoritiesId {
    private Member member;
    private Authority authority;
}
