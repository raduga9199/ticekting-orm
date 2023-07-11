package com.cydeo.bootstrap;

import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;
    //DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Employee e1 = new Employee("Berrie","Manueau", "bmanueau@dion.ne.jp",LocalDate.of(2006,4,8),120000, Gender.M);
        Employee e2 = new Employee("Aeriel","McNee", "McNee@dion.ne.jp",LocalDate.of(2006,4,9),120000, Gender.M);
        Employee e3 = new Employee("Sydney","Symonds", "Symonds@dion.ne.jp",LocalDate.of(2006,4,7),120000, Gender.M);
        Employee e4 = new Employee("Avram","Rowe", "Rowe@dion.ne.jp",LocalDate.of(2006,4,6),120000, Gender.M);
        Employee e5 = new Employee("Felix","Morfeew", "Morfeew@dion.ne.jp",LocalDate.of(2006,4,5),120000, Gender.M);


        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");
        Department d3 = new Department("Clothing","Home");
        Department d4 = new Department("Phones","Electronics");
        Department d5 = new Department("Computers","Electronics");

        e1.setDepartment(d1);
        e2.setDepartment(d2);
        e3.setDepartment(d3);
        e4.setDepartment(d4);
        e5.setDepartment(d5);

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeeRepository.saveAll(employeeList);
        //departmentRepository.saveAll(departmentList);


    }
}
