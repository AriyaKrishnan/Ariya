package mycontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.SessionScope;



@Controller
@RequestMapping("/bs2")
@SessionScope
public class BasicController2 {
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	public void sayHello(HttpServletRequest request) {
		System.out.println("Say Hello Method.." + request);
		HttpSession session = request.getSession();
		System.out.println("Session...:" + session.getId());
		session.setAttribute("mykey", "This is mykey Value...");
		String str = session.getAttribute("mykey").toString();
		System.out.println("Value..." + str);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello1")
	public void sayHello1(HttpSession session) {
		System.out.println("session...:" + session.getId());
		String str = session.getAttribute("mykey").toString();
		System.out.println("value...:" + str);
	}

}
