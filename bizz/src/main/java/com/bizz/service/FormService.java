package com.bizz.service;

import com.bizz.model.Form;
import org.springframework.data.domain.Page;

public interface FormService {
    Page<Form> list(int value, String column);
    void create(Form form);
    boolean delete(Long id);
}

