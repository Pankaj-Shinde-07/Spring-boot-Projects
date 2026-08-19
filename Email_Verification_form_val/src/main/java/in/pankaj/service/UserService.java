package in.pankaj.service;

import in.pankaj.entity.UserEntity;

public interface UserService {
	void saveUser(UserEntity user);
	
	boolean emailExists(String email);
}
