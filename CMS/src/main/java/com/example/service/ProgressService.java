package com.example.service;

import com.example.model.Progress;
import com.example.repository.ProgressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressService {
    @Autowired
    private ProgressRepository progressRepository;

    public List<Progress> getUserProgress(Long userId) {
        return progressRepository.findByUserId(userId);
    }

    public Progress updateUserProgress(Long userId, Progress progress) {
        return progressRepository.save(progress);
    }
}
