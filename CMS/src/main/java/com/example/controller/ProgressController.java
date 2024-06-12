package com.example.controller;

import com.example.model.Progress;
import com.example.service.ProgressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class ProgressController {
    @Autowired
    private ProgressService progressService;

    @GetMapping("/{id}/progress")
    public List<Progress> getUserProgress(@PathVariable Long id) {
        return progressService.getUserProgress(id);
    }

    @PostMapping("/{id}/progress")
    public Progress updateUserProgress(@PathVariable Long id, @RequestBody Progress progress) {
        return progressService.updateUserProgress(id, progress);
    }
}
