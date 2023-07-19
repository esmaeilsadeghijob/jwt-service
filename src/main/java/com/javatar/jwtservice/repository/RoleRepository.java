package com.javatar.jwtservice.repository;

import com.javatar.jwtservice.model.ERole;
import com.javatar.jwtservice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
