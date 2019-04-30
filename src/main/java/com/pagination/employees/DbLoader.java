package com.pagination.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbLoader  {
    @Autowired
    EmployeeRepo employeeRepo;

    //loads data to h2 database

    @Bean
    CommandLineRunner loader(EmployeeRepo employeeRepo){

        return args -> {
            employeeRepo.save( new Employee("name" , "Tech" , 500));
            employeeRepo.save( new Employee("micahel" , "Tech" , 500));
            employeeRepo.save( new Employee("jack" , "Tech" , 35500));
            employeeRepo.save( new Employee("jdu" , "Tech" , 500));
            employeeRepo.save( new Employee("mink" , "Tech" , 2500));
            employeeRepo.save( new Employee("money" , "Tech" , 62500));
            employeeRepo.save( new Employee("jack" , "Tech" , 5500));
            employeeRepo.save( new Employee("shoot" , "Tech" , 500));
            employeeRepo.save( new Employee("hop" , "Tech" , 500));
            employeeRepo.save( new Employee("down" , "Tech" , 4500));
            employeeRepo.save( new Employee("the" , "Tech" , 500));
            employeeRepo.save( new Employee("road " , "Tech" , 500));
            employeeRepo.save( new Employee("happly" , "Tech" , 500));
            employeeRepo.save( new Employee("thank " , "Tech" , 4500));
            employeeRepo.save( new Employee("you" , "Tech" , 5040));
            employeeRepo.save( new Employee("vanso" , "Tech" , 5050));
            employeeRepo.save( new Employee("name" , "Tech" , 500));
            employeeRepo.save( new Employee("micahel" , "Tech" , 500));
            employeeRepo.save( new Employee("jack" , "Tech" , 35500));
            employeeRepo.save( new Employee("jdu" , "Tech" , 500));
            employeeRepo.save( new Employee("mink" , "Tech" , 2500));
            employeeRepo.save( new Employee("money" , "Tech" , 62500));
            employeeRepo.save( new Employee("jack" , "Tech" , 5500));
            employeeRepo.save( new Employee("shoot" , "Tech" , 500));
            employeeRepo.save( new Employee("hop" , "Tech" , 500));
            employeeRepo.save( new Employee("down" , "Tech" , 4500));
            employeeRepo.save( new Employee("the" , "Tech" , 500));
            employeeRepo.save( new Employee("road " , "Tech" , 500));
            employeeRepo.save( new Employee("happly" , "Tech" , 500));
            employeeRepo.save( new Employee("thank " , "Tech" , 4500));
            employeeRepo.save( new Employee("you" , "Tech" , 5040));
            employeeRepo.save( new Employee("vanso" , "Tech" , 5050));
            employeeRepo.save( new Employee("name" , "Tech" , 500));
            employeeRepo.save( new Employee("micahel" , "Tech" , 500));
            employeeRepo.save( new Employee("jack" , "Tech" , 35500));
            employeeRepo.save( new Employee("jdu" , "Tech" , 500));
            employeeRepo.save( new Employee("mink" , "Tech" , 2500));
            employeeRepo.save( new Employee("money" , "Tech" , 62500));
            employeeRepo.save( new Employee("jack" , "Tech" , 5500));
            employeeRepo.save( new Employee("shoot" , "Tech" , 500));
            employeeRepo.save( new Employee("hop" , "Tech" , 500));
            employeeRepo.save( new Employee("down" , "Tech" , 4500));
            employeeRepo.save( new Employee("the" , "Tech" , 500));
            employeeRepo.save( new Employee("road " , "Tech" , 500));
            employeeRepo.save( new Employee("happly" , "Tech" , 500));
            employeeRepo.save( new Employee("thank " , "Tech" , 4500));
            employeeRepo.save( new Employee("you" , "Tech" , 5040));
            employeeRepo.save( new Employee("vanso" , "Tech" , 5050));
        };
    }
}
