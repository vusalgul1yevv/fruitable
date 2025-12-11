package com.example.fruitables.repositories;

import com.example.fruitables.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
