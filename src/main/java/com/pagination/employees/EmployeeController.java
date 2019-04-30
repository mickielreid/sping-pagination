package com.pagination.employees;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepo repository;


    public EmployeeController(EmployeeRepo repository) {
        this.repository = repository;
    }

    //this maps to the home page
    @GetMapping("/")
    public String Home() {

        return "index";
    }

    //default amount of items on the page is 10
    @GetMapping("/employees")
    public String getEmployees(@PageableDefault(size = 10) Pageable pageable, Model model) {
        Page<Employee> page = repository.findAll(pageable);

        model.addAttribute("page", page);
        return "employees";
    }
}
