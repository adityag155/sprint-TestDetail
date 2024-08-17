package org.javapatil.testdetail.dao.impl;

import java.util.List;
import org.javapatil.testdetail.dao.TestDetailDao;
import org.javapatil.testdetail.extractor.TestDetailListExtractor;
import org.javapatil.testdetail.model.TestDetailForm;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor

public class TestDetailDaoImpl implements TestDetailDao{
	private JdbcTemplate jdbcTemplate;
	private TestDetailListExtractor testDetailListExtractor;
	@Override
	public List<TestDetailForm> getTestDetailList() {
		List<TestDetailForm>testDetailList= jdbcTemplate.query("select * from test_detail order by test_id", testDetailListExtractor::extractData);	
		return testDetailList;
	}
}