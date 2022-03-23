package com.bizz.repository;

import com.bizz.model.Form;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends PagingAndSortingRepository<Form, Long> {
}
