package org.javapatil.testdetail.service.impl;

import java.util.List;

import org.javapatil.testdetail.dao.TestDetailDao;
import org.javapatil.testdetail.model.TestDetailForm;
import org.javapatil.testdetail.service.TestDetailService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TestDetailServiceImpl implements TestDetailService {
	
	private TestDetailDao testDetailDao;

	
	@Override
	public List<TestDetailForm> getTestDetailListService() {
		
		List<TestDetailForm>testDetailList=testDetailDao.getTestDetailList();
		return testDetailList ;
	}
}
