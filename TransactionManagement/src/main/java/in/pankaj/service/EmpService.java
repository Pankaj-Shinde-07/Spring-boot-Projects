package in.pankaj.service;

import org.springframework.stereotype.Service;

import in.pankaj.entity.EmpAddress;
import in.pankaj.entity.Employee;
import in.pankaj.repo.AddressRepo;
import in.pankaj.repo.EmployeeRepo;
import jakarta.transaction.Transactional;

@Service
@Transactional(rollbackOn = Exception.class)
public class EmpService {
	
	private EmployeeRepo emp;
	private AddressRepo add;
	
	public EmpService(EmployeeRepo emp, AddressRepo add) {
		this.emp = emp;
		this.add = add;
	}
	
	public void saveData() {
		Employee e = new Employee();
		e.setEmpName("Pankaj");
		e.setEmpSalary(999999.90);
	
		Employee save = emp.save(e);
		
		
		EmpAddress a = new EmpAddress();
		a.setCity("Yeola");
		a.setState("MH");
		a.setCountry("India");
		a.setType("temp");
		
		a.setEmployee(save);
		
		add.save(a);
	}
	
	public Integer insertData() {
		
		return null;
	}
	
	

}
