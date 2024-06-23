package com.shofiqul.library.repositories;

import com.shofiqul.library.models.Roles;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface RolesRepo extends JpaRepository<Roles, Long> {
    Roles findByName(String roleName);

}
