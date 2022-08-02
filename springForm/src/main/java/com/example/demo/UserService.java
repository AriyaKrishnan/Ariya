package com.example.demo;



import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserDAO udao;
	
	public UserDAO getUdao() {
		return udao;
	}
	
	public UserDAO setUdao() {
		return udao;
	}
	public void setUdao(UserDAO udao) {
		this.udao = udao;
	}
	public void saveUser1(UserDTO user) {
		getUdao().save(user);
	}
public List<UserDTO> checkUser(String name,String pass){
		
		return getUdao().CheckUser(name, pass);
		
	}
	
	public List<UserDTO> checkUID(UserDTO us) {
		
		return getUdao().checkUID(us);
		
	}
}