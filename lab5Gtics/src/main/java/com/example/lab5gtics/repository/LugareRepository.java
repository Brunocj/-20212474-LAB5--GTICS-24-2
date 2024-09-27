package com.example.lab5gtics.repository;

import com.example.lab5gtics.entity.Lugare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LugareRepository extends JpaRepository<Lugare,Integer> {
}
