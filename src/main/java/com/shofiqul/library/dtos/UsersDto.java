package com.shofiqul.library.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsersDto {
    private long id;
    private String name;
    private String username;
    private String email;
}
