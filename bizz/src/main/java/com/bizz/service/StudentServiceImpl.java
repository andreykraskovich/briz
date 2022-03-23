package com.bizz.service;

import com.bizz.model.Student;
import com.bizz.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;
    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    @Override
    public Page<Student> list(int value, String column) {
        Pageable firstPageWithTenElements = PageRequest.of(value, 10);
        return studentRepository.findAll(firstPageWithTenElements);
    }

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public boolean delete(Long id) {
        if(!studentRepository.existsById(id)){
            return false;
        }
        studentRepository.deleteById(id);
        return true;
    }
}
