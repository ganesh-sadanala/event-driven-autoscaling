package com.systems.repository;

// AccountRepository.java
import com.systems.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

