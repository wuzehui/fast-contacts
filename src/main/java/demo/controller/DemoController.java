package demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
=======
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.vo.DemoStore;

@Controller
public class DemoController {
	
	/**
	 * demo home page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="demo",method = RequestMethod.GET)
	public String demo(Model model){
		System.out.println("******* here ******");
<<<<<<< HEAD
		return "WEB-INF/jsp/demo/index.jsp";
	}
=======
		return "demo/index";
	}
	
	@ResponseBody
	@RequestMapping(value="demo/stroe",method = RequestMethod.GET)
	public String getDemoStore(){
		String rst = "{success: true,"
				+ "data: "
				+ "[{id: 1, name: 'Ed',    email: 'ed@sencha.com'},"
				+ "{id: 2, name: 'Tommy', email: 'tommy@sencha.com'}]}";
		JSONObject object = null;
		try {
			object = new JSONObject(rst);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return object.toString();
	}
	
	@RequestMapping(value="demo/updateStore",method = RequestMethod.POST)
	public String updateStore(Model model,HttpServletRequest request){
		request.getParameter("values");
		String rst = "{success: true}";
		System.out.println("here");
		JSONObject object = null;
		try {
			object = new JSONObject(rst);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return object.toString();
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
     * ָ���¼ҳ��
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
     * ָ���޷��ʶ�Ȩ��ҳ�� 
     *  
     * @return 
     */  
    @RequestMapping(value = "auth/denied", method = RequestMethod.GET)  
    public String getDeniedPage() {  
  
        return "deniedpage";  
  
    }  
>>>>>>> paris
}
