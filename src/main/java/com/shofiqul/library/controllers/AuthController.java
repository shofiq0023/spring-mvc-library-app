package com.shofiqul.library.controllers;

import com.shofiqul.library.dtos.UserRegDto;
import com.shofiqul.library.models.Users;
import com.shofiqul.library.services.UserServices;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AuthController {
    private final UserServices userServices;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        UserRegDto regDto = new UserRegDto();
        model.addAttribute("reg", regDto);

        return "register";
    }

    @PostMapping("/create/user")
    public void createUser(@ModelAttribute("reg") UserRegDto dto, Model model, BindingResult result) {
        userServices.createUser(dto, model, result);
    }
}
