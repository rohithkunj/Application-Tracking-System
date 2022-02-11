package net.javaguides.springboot.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Login;
import net.javaguides.springboot.repository.LoginRepository;







@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
  
  public Login login(String email, String password) {
	  Login user = repo.findByemailAndPassword(email, password);
  	return user;
  }
	

}