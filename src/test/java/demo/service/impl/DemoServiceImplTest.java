package demo.service.impl;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;

import com.chinadreamer.test.TestBase;

import demo.service.DemoService;

public class DemoServiceImplTest extends TestBase{
	@Resource(name ="demoService")
	private DemoService demoService;
	@Test
	public void testTestFindUser() {
		this.demoService.testFindUser("abc");
	}

}
