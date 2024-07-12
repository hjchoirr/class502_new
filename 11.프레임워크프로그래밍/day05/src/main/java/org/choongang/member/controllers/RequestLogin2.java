package org.choongang.member.controllers;

import lombok.Builder;

@Builder
public record RequestLogin2(
        String email,
        String password
) {}
