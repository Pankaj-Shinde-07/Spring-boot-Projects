package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>{

}
