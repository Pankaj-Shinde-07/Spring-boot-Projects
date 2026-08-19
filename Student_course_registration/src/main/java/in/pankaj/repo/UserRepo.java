package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{

}
