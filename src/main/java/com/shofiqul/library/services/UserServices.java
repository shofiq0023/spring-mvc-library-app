package com.shofiqul.library.services;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.shofiqul.library.dtos.UserRegDto;

public interface UserServices {
    void createUser(UserRegDto regDto, Model model, BindingResult result);
}
