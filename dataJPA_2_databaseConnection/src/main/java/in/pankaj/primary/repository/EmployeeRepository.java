package in.pankaj.primary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pankaj.primary.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
