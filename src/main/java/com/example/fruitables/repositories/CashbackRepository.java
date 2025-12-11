package com.example.fruitables.repositories;

import com.example.fruitables.entities.Cashback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashbackRepository extends JpaRepository<Cashback,Long> {
}
