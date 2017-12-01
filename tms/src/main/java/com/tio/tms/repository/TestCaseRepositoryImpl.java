package com.tio.tms.repository;

import com.tio.tms.domain.TestCase;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


public class TestCaseRepositoryImpl implements TestCaseRepositoryCustom{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public String findTestCaseNameById(int id) {
        Query query = entityManager.createNativeQuery("SELECT test_case_name from test_case where id = ?", Integer.toString(id));
        query.setParameter(1, id);
        return query.getSingleResult().toString();
    }

}
