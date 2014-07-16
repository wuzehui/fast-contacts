package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {
	
	@RequestMapping(value="demo",method = RequestMethod.GET)
	public String demo(Model model){
		System.out.println("******* here ******");
		return "WEB-INF/jsp/demo/index.jsp";
	}
}
