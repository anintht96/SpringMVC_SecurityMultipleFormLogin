package spring.mvc.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BaseController {

	@RequestMapping(value = "/login1",method = RequestMethod.GET)
	public String login1(@RequestParam(name = "message",required = false)String message,final Model model) {
		if(message!=null&&!message.isEmpty()) {
			if(message.equals("error")) {
				model.addAttribute("message", "Login Failed!");
			}
			if(message.equals("logout")) {
				model.addAttribute("message", "Logout!");
			}
		}
		return "login1";
	}
	
	@RequestMapping(value = "/login2",method = RequestMethod.GET)
	public String login2(@RequestParam(name = "message",required = false)String message,final Model model) {
		if(message!=null&& !message.isEmpty()) {
			if(message.equals("error")) {
				model.addAttribute("message", "Login Failed!");
			}
			if(message.equals("logout")) {
				model.addAttribute("message", "Logout!");
			}
		}
		return "login2";
	}
	
	@RequestMapping(value = "/403",method=RequestMethod.GET)
	public String accessDenied(final Model model,Principal principal) {
		model.addAttribute("message","Hi "+ principal.getName()+ " You do not have been permission access this page! ");
		return "403";
	}
	
	@RequestMapping(value = {"/","/index"},method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/user",method=RequestMethod.GET)
	public String user() {
		return "user";
	}
	
	@RequestMapping(value = "/admin/admin",method=RequestMethod.GET)
	public String admin() {
		return "admin";
	}
}
