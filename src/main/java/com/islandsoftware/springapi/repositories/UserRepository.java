package com.islandsoftware.springapi.repositories;

import com.islandsoftware.springapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
