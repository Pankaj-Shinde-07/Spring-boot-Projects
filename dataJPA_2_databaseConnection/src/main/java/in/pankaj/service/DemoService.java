package in.pankaj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pankaj.primary.entity.Employee;
import in.pankaj.primary.repository.EmployeeRepository;
import in.pankaj.secondary.entity.Student;
import in.pankaj.secondary.repository.StudentRepository;

@Service
public class DemoService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private StudentRepository studentRepository;

    public void saveData() {

        Employee emp = new Employee();
        emp.setName("Pankaj");
        emp.setSalary(60000.0);

        employeeRepository.save(emp);

        Student st = new Student();
        st.setName("Rahul");
        st.setCourse("Computer Science");

        studentRepository.save(st);

        System.out.println("Data Saved Successfully");
    }
}
