package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long> {}

