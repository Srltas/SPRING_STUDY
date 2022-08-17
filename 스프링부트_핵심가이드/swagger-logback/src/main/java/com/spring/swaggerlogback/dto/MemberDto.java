package com.spring.swaggerlogback.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MemberDto {

    private String name;
    private String email;
    private String organization;

}
