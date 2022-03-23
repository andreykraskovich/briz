package com.bizz.service;


import com.bizz.model.Teacher;
import org.springframework.data.domain.Page;

public interface TeacherService {
    Page<Teacher> list(int value, String column);
    void create(Teacher teacher);
    boolean delete(Long id);
}
