package com.bizz.service;

import com.bizz.model.Form;
import com.bizz.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FormServiceImpl implements FormService{
    private FormRepository formRepository;
    @Autowired
    public FormServiceImpl(FormRepository formRepository) {
        this.formRepository = formRepository;
    }

    @Override
    public Page<Form> list(int value, String column) {
        Pageable firstPageWithTenElements = PageRequest.of(value, 10);
        return formRepository.findAll(firstPageWithTenElements);
    }

    @Override
    public void create(Form form) {
        formRepository.save(form);
    }

    @Override
    public boolean delete(Long id) {
        if(!formRepository.existsById(id)){
            return false;
        }
        formRepository.deleteById(id);
        return true;
    }
}
