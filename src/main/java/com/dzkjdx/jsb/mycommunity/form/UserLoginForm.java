package com.dzkjdx.jsb.mycommunity.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserLoginForm {
    @NotBlank
    private String userName;
    @NotBlank
    private String userPassWord;
}
