package com.example.demo;

import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/form")
public class MyController {
	@Autowired
	private CustomerService service;
	public CustomerService getService() {
		return service;
	}

	public void setService(CustomerService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/forms1")
	public ModelAndView websearch1() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/forms1")
	public ModelAndView welcome1(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		System.out.println(uname + ":" + upass);
		List<Customer> c = service.checkUser(uname, upass);
		Iterator<Customer> itr = c.iterator();
		while (itr.hasNext()) {

			if (itr.next().getFlag() == 0) {

				mv.setViewName("welcome");
				service.updateFlag(1, uname, upass);
				return mv;
			} else {

				mv.setViewName("logout");
				return mv;

			}

		}
		

		mv.setViewName("error");
		return mv;

	
	}

	@RequestMapping(method = RequestMethod.POST, value = "/shop")
	public String shop(Customer cus, HttpServletRequest request) {
		Enumeration<String> em = request.getParameterNames();
		HttpSession hs = request.getSession();

		while (em.hasMoreElements()) {
			String a = em.nextElement().toString();
			String b = request.getParameter(a);
			hs.setAttribute(a, b);
		}
		return request.getParameter("shop");

	}
	@RequestMapping(method = RequestMethod.GET,value = "/shopimg")
	public void met(HttpServletRequest request,HttpServletResponse response) {
		
		  response.setContentType("image/jpg");
		  String name =request.getParameter("name");
		  String shopname =request.getParameter("shopname");
		  try {
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/behindtech","root","root");
		  String sql = "SELECT * FROM "+shopname+" WHERE name =?";
		  PreparedStatement ps = con.prepareStatement(sql);
		
		  ps.setString(1, name);
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()){
		    byte [] imageData = rs.getBytes("img");
		    OutputStream os = response.getOutputStream();
		             os.write(imageData);
		             os.flush();
		             os.close();
		   }
		  } catch (Exception e) {
		   e.printStackTrace();
		  }
	}
		  @RequestMapping(method = RequestMethod.GET, value = "/reg")
			public ModelAndView websearch11() {
				
				ModelAndView mv=new ModelAndView();
				Customer us=new Customer();
				us.setFlag(0);
				int a=us.getUid()+1;
				us.setUid(a);
				mv.addObject("userObj", us);
				mv.setViewName("register");
				return mv;
			}
		
		 

	@RequestMapping(method=RequestMethod.POST,value="/reg")
	public ModelAndView processFrom1(@Valid@ModelAttribute("userObj") Customer cus,BindingResult res,HttpServletRequest request) {
		ModelAndView mv=new ModelAndView();
		if (res.hasErrors()) {
			mv.setViewName("register");
			return mv;
		} else {

		System.out.println("Username...:"+cus.getUname());
		String upass=request.getParameter("upass");
		String pass2=request.getParameter("pass2");
		if(upass.equals(pass2)) {
			List<Customer> li=service.checkuid(cus);
			Iterator<Customer> itr=li.iterator();
			int b=0;
			while(itr.hasNext()) {
				b=itr.next().getUid();
			}
			System.out.println(b);
			cus.setUid(b+1);
			cus.setUpass(upass);
		mv.addObject("myuser",cus);
		service.saveUser(cus);
		mv.setViewName("login");
		return mv;
	}
else {
	
	mv.setViewName("error");
	
	return mv;
	
}
		}


	
}
}