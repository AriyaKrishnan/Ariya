package mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bs")
public class BasicController {
	@RequestMapping(method=RequestMethod.GET,value = "/hello")
	public void sayHello() {
		System.out.println("Say Hello method..");
	}
	@RequestMapping(method=RequestMethod.GET,value = "/hello1")
	public void sayHello1(@RequestParam("name")String uname,@RequestParam("pass")String upass) {
		System.out.println("Say Hello method1.."+uname+":"+upass);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/hello2/{myp}")
	public void sayHello2(@PathVariable("myp") String mypath) {
		System.out.println("Say Hello method2.."+mypath);
	}
	@RequestMapping(method = RequestMethod.GET, value = "/hello3/{myp}/{myw}")
	public void sayHello3(@PathVariable("myp") String mypath,@PathVariable("myw") String mywife) {
		System.out.println("Say Hello method3.."+mypath+":"+mywife);
	}


}
