package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	@RequestMapping(value="demo",method = RequestMethod.GET)
	public String demo(Model model){
		System.out.println("******* here ******");
		return "demo/index";
	}
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String index(Model model){
		System.out.println("******* here ******");
		return "login";
	}
	
	@RequestMapping(value = "admin",method = RequestMethod.GET)
	public String admin(Model model){
		System.out.println("********** admin page **********");
		return "demo/adminpage";
	}
	
	@RequestMapping(value = "common",method = RequestMethod.GET)
	public String common(Model model){
		System.out.println("********** common page **********");
		return "demo/commonpage";
	}
	
	 /** 
     * 指向登录页面 
     */  
    @RequestMapping(value = "auth/login", method = RequestMethod.GET)  
    public String getLoginPage(  
            @RequestParam(value = "error", required = false) boolean error,  
            ModelMap model) {  
  
        if (error == true) {  
            // Assign an error message  
            model.put("error",  
                    "You have entered an invalid username or password!");  
        } else {  
            model.put("error", "");  
        }  
        return "loginpage";  
  
    }  
  
    /** 
     * 指定无访问额权限页面 
     *  
     * @return 
     */  
    @RequestMapping(value = "auth/denied", method = RequestMethod.GET)  
    public String getDeniedPage() {  
  
        return "deniedpage";  
  
    }  
}
