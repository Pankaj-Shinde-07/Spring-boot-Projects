package in.pankaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pankaj.entity.UserEntity;
import in.pankaj.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo up;
	
	public void saveUser(UserEntity user) {
		up.save(user);
	}

}
