package com.demo.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.mvc.service.AddService;

@Controller
public class AddController {

	@Autowired
	AddService addService;

	@RequestMapping("/login")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("t1");
		String password = request.getParameter("t2");

		if (name.equals("user") && password.equals("password")) {

			ModelAndView mv = new ModelAndView();
			mv.setViewName("display.jsp");
			mv.addObject("result", " You Successfully Logined... ");

			return mv;
		} else {

			ModelAndView mv1 = new ModelAndView();
			mv1.setViewName("error.jsp");
			mv1.addObject("result", " Please use valid credentials.. ");

			return mv1;
		}
	}
}
