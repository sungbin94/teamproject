package com.kh.great.web.dto.member;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class findId {
    @NotBlank
    private String memId;                       //varchar2(30)

    @NotBlank
    private String memName;                     //varchar2(18)
}