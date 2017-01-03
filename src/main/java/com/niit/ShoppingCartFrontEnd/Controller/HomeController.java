package com.niit.ShoppingCartFrontEnd.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShoppingCartFrontEnd.dao.temp.UserDAO;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homepage() {
		return "home";
	}

	@RequestMapping("/login")
	public ModelAndView showLoginPage() {
		ModelAndView mv = new ModelAndView("login"); // calling a method
														// ModelAndView &
														// creating an object
		mv.addObject("msg", "you clicked login link"); // adding message in to
														// the object
		mv.addObject("showLoginPage", "true");
		System.out.println("in login method");
		return mv; // returning object
	}

	@RequestMapping("/register")
	public ModelAndView showRigesterPage() {
		ModelAndView mv = new ModelAndView("register");
		mv.addObject("msg", "you clicked rigester link");
		mv.addObject("showRigesterPage", "true");
		return mv;
	}

	@RequestMapping("/validation")
	public ModelAndView validate(@RequestParam("id") String id, @RequestParam("password") String pwd) {
		System.out.println("in validation method");
		System.out.println("id :" + id);
		System.out.println("password :" + pwd);
		ModelAndView mv = new ModelAndView("home");
		UserDAO userDAO = new UserDAO();
		if (userDAO.isValidCredentials(id, pwd) == true) {
			mv.addObject("successMsg", "you logged in successfully");
		} else {
			mv.addObject("errorMsg", "Invalied crediantiloas...please try again");
		}
		return mv;
	}
}
