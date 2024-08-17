package org.javapatil.testdetail.Controller;

import java.util.List;

import org.javapatil.testdetail.model.TestDetailForm;
import org.javapatil.testdetail.service.TestDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "testdetails")

public class TestDetailController {
	private TestDetailService testDetailService;
	
	
	
	@GetMapping
	public List<TestDetailForm> getTestDetlListCtrl()
	{
		List<TestDetailForm> testDetailList= testDetailService.getTestDetailListService();
		return testDetailList;
	}

}
