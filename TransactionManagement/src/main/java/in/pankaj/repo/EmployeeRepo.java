package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
