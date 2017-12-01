package com.tio.tms.repository;

import java.util.List;

import org.aspectj.weaver.ast.Test;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

//import com.tio.tms.domain.TDBillPayInquiry;
import com.tio.tms.domain.TestCase;
import org.springframework.stereotype.Repository;

public interface TestCaseRepository extends PagingAndSortingRepository<TestCase, Integer>, TestCaseRepositoryCustom{
    TestCase findById(int id);
}
