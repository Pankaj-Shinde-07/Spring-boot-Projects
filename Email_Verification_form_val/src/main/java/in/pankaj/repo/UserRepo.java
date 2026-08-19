package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.pankaj.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

    boolean existsByEmail(String email);

}
