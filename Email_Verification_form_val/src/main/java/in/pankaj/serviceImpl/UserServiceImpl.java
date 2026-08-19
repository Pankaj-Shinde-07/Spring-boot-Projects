package in.pankaj.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pankaj.entity.UserEntity;
import in.pankaj.repo.UserRepo;
import in.pankaj.service.EmailService;
import in.pankaj.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo repo;
    
    @Autowired
    private EmailService emailService;

    @Override
    public void saveUser(UserEntity user) {

        try {
			repo.save(user);
			
			emailService.sendWelcomeEmail(
			        user.getEmail(),
			        user.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    @Override
    public boolean emailExists(String email) {
        return repo.existsByEmail(email);
    }
}