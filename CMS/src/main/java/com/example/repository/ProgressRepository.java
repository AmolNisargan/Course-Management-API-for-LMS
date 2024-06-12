package com.example.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Progress;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
   
	List<Progress> findByUserId(Long userId);
}
