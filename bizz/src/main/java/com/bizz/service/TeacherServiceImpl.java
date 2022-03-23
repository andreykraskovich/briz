package com.bizz.service;

import com.bizz.model.Teacher;
import com.bizz.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{
    private TeacherRepository teacherRepository;
    @Autowired
    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Page<Teacher> list(int value, String column) {
        Pageable firstPageWithTenElements = PageRequest.of(value, 10);
        return teacherRepository.findAll(firstPageWithTenElements);
    }

    @Override
    public void create(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public boolean delete(Long id) {
        if(!teacherRepository.existsById(id)){
            return false;
        }
        teacherRepository.deleteById(id);
        return true;
    }
}
