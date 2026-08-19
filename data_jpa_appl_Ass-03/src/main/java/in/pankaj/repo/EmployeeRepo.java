package in.pankaj.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.pankaj.dto.EmployeeDTO;
import in.pankaj.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, String>{

	@Query("select e.id as id, e.name as name from EmployeeEntity e")
	List<EmployeeView> getEmployees();
	
	
	@Query("""
			select new in.pankaj.dto.EmployeeDTO(
			       e.id,
			       e.name)
			from EmployeeEntity e
			""")
			List<EmployeeDTO> getEmployeeDTO();
}
