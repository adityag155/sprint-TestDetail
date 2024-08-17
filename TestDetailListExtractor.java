package org.javapatil.testdetail.extractor;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.javapatil.testdetail.model.TestDetailForm;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

@Component
public class TestDetailListExtractor implements ResultSetExtractor<List<TestDetailForm>>{

	@Override
	public List<TestDetailForm> extractData(ResultSet rs) throws SQLException, DataAccessException {
	
		ArrayList<TestDetailForm> testList=new ArrayList<TestDetailForm>();
		TestDetailForm tf=null;	
		while(rs.next())
		{
			tf=new TestDetailForm();
//			tf.setTest_id(rs.getInt("test_id"));
//			tf.setTestno(rs.getInt("test_no"));
//			tf.setQuestionno(rs.getInt("question_no"));
			
			tf.setTest_id(rs.getInt("test_id"));
            tf.setTest_no(rs.getInt("test_no"));
            tf.setQuestion_no(rs.getInt("question_no"));
            testList.add(tf);
        }	
		return testList;
	}
}