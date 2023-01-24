package webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import webapp.Dao.BlogRep;
import webapp.Serve.BlogServe;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class employeecontroller {
	
	@Autowired
	private BlogServe blogserve;

	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		System.out.print("⭐⭐⭐⭐⭐⭐");
	//	console.log("ADSSD");
		System.out.print(blogserve.toString());
		model.addAttribute("BlogPojo", blogserve.findByTitle(null));
		
		return "index";
	}

}
