package webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webapp.Serve.employeeServe;

@Controller
public class employeecontroller {
	
	@Autowired
	private employeeServe employeeserve;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("employee", employeeserve.getAllemployees());
		return "index";
	}

}
