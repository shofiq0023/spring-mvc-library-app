package com.shofiqul.library.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
public class UserRegDto {
    private long id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String username;
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
}
