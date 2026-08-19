package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.CourseEntity;

public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

}
