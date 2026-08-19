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
    EmployeeRepository employeeRepo;

    @Autowired
    StudentRepository studentRepo;

    public void saveData() {

        employeeRepo.save(new Employee("Pankaj",50000.0));

        studentRepo.save(new Student("Rahul","Computer Science"));

        System.out.println("Data Saved Successfully");
    }

}