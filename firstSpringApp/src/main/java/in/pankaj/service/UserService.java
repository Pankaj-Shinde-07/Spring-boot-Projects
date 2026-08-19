package in.pankaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.pankaj.dao.UserDao;

@Component
public class UserService {
	@Autowired
	private UserDao udo;
	
	public void getName(int id) {
		udo.getNameById(id);
		
		System.out.println("User Service called ");
	}
}
