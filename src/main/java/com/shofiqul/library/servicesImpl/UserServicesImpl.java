package com.shofiqul.library.servicesImpl;

import com.shofiqul.library.dtos.UserRegDto;
import com.shofiqul.library.models.Roles;
import com.shofiqul.library.models.Users;
import com.shofiqul.library.repositories.RolesRepo;
import com.shofiqul.library.repositories.UsersRepo;
import com.shofiqul.library.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServicesImpl implements UserServices {
    private final UsersRepo usersRepo;
    private final RolesRepo rolesRepo;

    @Override
    public void createUser(UserRegDto regDto) {
        Roles role = rolesRepo.findByName("USER");
        Users user = Users.builder()
                .name(regDto.getName())
                .email(regDto.getEmail())
                .username(regDto.getUsername())
                .password(regDto.getPassword())
                .roles(List.of(role))
                .build();

        usersRepo.save(user);
    }
}
