package in.pankaj.secondary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.secondary.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
