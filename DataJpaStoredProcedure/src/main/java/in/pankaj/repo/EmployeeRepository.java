package in.pankaj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import in.pankaj.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Procedure(procedureName="insertEmployee")
	void insertEmployee(@Param("p_name") String name,
			@Param("p_salary") Double salary);
}
