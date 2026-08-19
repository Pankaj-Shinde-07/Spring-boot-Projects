package in.pankaj.service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import in.pankaj.entity.Employee;
import in.pankaj.repo.EmployeeRepository;

@Service
public class EmployeeService {
	private final EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		super();
		this.repo = repo;
	}
	
	public void saveEmployee(String name, Double salary) {
		repo.insertEmployee(name,salary);
	}
	
	public void exportExcel() throws IOException {

        List<Employee> employees = repo.findAll();

        ExcelGenerator.generateExcel(employees);

        System.out.println("Excel exported successfully...");
    }
}
