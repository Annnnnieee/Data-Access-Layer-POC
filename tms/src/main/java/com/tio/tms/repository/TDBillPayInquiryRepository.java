package com.tio.tms.repository;

import com.tio.tms.domain.TDBillPayInquiry;
import com.tio.tms.domain.TestCase;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

//import com.tio.tms.domain.TDBillPayInquiry;

public interface TDBillPayInquiryRepository extends PagingAndSortingRepository<TDBillPayInquiry, Integer>{

}
