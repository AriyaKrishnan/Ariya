package com.example.demo;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/test")
public class MyController {
	@Autowired
	MessageSource ms;
	
	@Autowired
	private UserService services;
	public UserService getServices() {
		return services;
	}
	public void setService(UserService service) {
		this.services = service;
	}
	@RequestMapping(method = RequestMethod.GET, value = "/tes")
	public ModelAndView websearch() {
		
		ModelAndView mandv=new ModelAndView();
		TestDTO us=new TestDTO();
		us.setFlag(0);
		int a=us.getUid()+1;
		us.setUid(a);
		mandv.addObject("userObj", us);
		mandv.setViewName("register");
		return mandv;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/tes")
	public ModelAndView processFrom(@Valid@ModelAttribute("userObj") TestDTO us,BindingResult rs,HttpServletRequest request) {
		ModelAndView mandv=new ModelAndView();
		if (rs.hasErrors()) {
			mandv.setViewName("register");
			return mandv;
		} else {

		System.out.println("Username...:"+us.getUname());
		String pass1=request.getParameter("pass1");
		String pass2=request.getParameter("pass2");
		if(pass1.equals(pass2)) {
			List<TestDTO> li=services.checkUID(us);
			Iterator<TestDTO> itr=li.iterator();
			int b=0;
			while(itr.hasNext()) {
				b=itr.next().getUid();
			}
			System.out.println(b);
			us.setUid(b+1);
		us.setUpass(pass1);
		mandv.addObject("myuser",us);
		services.saveUser1(us);
		mandv.setViewName("welcome");
		return mandv;
	}
else {
	
	mandv.setViewName("error");
	
	return mandv;
	
}
		}

}
@RequestMapping(method=RequestMethod.GET,value="/tes1")
public ModelAndView websearch1() {
	ModelAndView mandv=new ModelAndView();
	mandv.setViewName("login");
	return mandv;
}
@RequestMapping(method = RequestMethod.POST,value = "/tes1")
public ModelAndView welcome1(HttpServletRequest request) {
	
	ModelAndView mv=new ModelAndView();
	
	String name=request.getParameter("uname");
	
	String pass=request.getParameter("pass");
	
	System.out.println(name+":"+pass);
	
	List<TestDTO> u=services.checkUser(name, pass);
	
	Iterator<TestDTO> itr=u.iterator();
	
	while(itr.hasNext()) {
		
		mv.setViewName("welcome");
		
		return mv;
		
	}
	
	mv.setViewName("error");
	
	return mv;
	
}
@RequestMapping(method = RequestMethod.POST, value = "/tes2")
public String shop(TestDTO us, HttpServletRequest request) {
	Enumeration<String> em = request.getParameterNames();
	HttpSession hs = request.getSession();

	while (em.hasMoreElements()) {
		String a = em.nextElement().toString();
		String b = request.getParameter(a);
		hs.setAttribute(a, b);
	}
	return request.getParameter("");

}
}
