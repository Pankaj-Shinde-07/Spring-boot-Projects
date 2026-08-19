package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.ContactUsEntity;

public interface ContactUsRepo extends JpaRepository<ContactUsEntity, Integer> {

}
