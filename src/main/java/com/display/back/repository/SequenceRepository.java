package com.display.back.repository;

import com.display.back.model.Sequence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SequenceRepository extends JpaRepository<Sequence, Integer> {
    Optional<Sequence> findById(int id);
}