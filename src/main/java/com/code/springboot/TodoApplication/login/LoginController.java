package com.code.springboot.TodoApplication.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AuthenticationService authenticationService;

	/*
	 * @RequestMapping("/login") public String loginPageJsp() { return "login"; }
	 */

	/*
	 * // With query parameter // Model // http://localhost:8080/login?name=rahul
	 * 
	 * @RequestMapping("/login") public String loginPageJsp(@RequestParam String
	 * name, ModelMap model) { model.put("name",name);
	 * logger.debug("Request param is {}",name); logger.info("Request param is {}",
	 * name); return "login"; }
	 */

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String loginPageJsp() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWolcomePageJsp(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		// model.put("password", password);

		// Authentication
		// name = Rahul Maurya
		// password = dummy
		if (authenticationService.authenticate(name, password)) {

			return "welcome";
		}
		model.put("errorMessage", "Invalid credentials! Please try again!");
		return "login";

	}
}
