package com.example.controller;

import com.example.model.Course;
import com.example.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    @PreAuthorize("hasRole('TEACHER')")
    public Course createCourse(@RequestBody Course course, Principal principal) {
        return courseService.createCourse(course, principal.getName());
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('TEACHER')")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('TEACHER')")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}
