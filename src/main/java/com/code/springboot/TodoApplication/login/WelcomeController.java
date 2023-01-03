package com.code.springboot.TodoApplication.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String gotoWelcomePageJsp(ModelMap model) {
		model.put("name", "Rahul");
		return "welcome";
	}

	
}
