package demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.dao.DemoDao;
import demo.service.DemoService;

@Service("demoService")
public class DemoServiceImpl implements DemoService{
	@Resource(name = "demoDao")
	private DemoDao demoDao;
	
	public void testFindUser(String username){
		this.demoDao.testFindUser(username);
	}
}
