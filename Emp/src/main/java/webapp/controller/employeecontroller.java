package webapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import webapp.Dao.BlogRep;
import webapp.Entity.BlogPojo;
import webapp.Serve.BlogServe;
//@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class employeecontroller {
	@Autowired
	private BlogServe blogserve;
	List<BlogServe> list = new ArrayList<>();
//
//	@Autowired
//	private BlogPojo blogPojo;
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		//System.out.print("⭐⭐⭐⭐⭐⭐");
	//	console.log("ADSSD");
		
		//BlogPojo blogPojo();
		//System.out.print(blogPojo.toString());
	//System.out.print("----->"+blogserve.getAllBlogs1());
		
		model.addAttribute("benny", blogserve.getAllBlogs1());
		
		return "index";
	}

}
