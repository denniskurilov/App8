package com.denniskurilov.app8.controller;

import com.denniskurilov.app8.entity.Employee;
import com.denniskurilov.app8.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String showAllEmployees(Model model){
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employees/list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model){
        Employee employee = new Employee();
        employee.setId(0);
        model.addAttribute("employee", employee);
        return "employees/form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee, Model model){
        if(employee.getId() == 0){
            employee.setId(null);
        }
        employeeService.save(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam("id") Integer employeeId, Model model){
        Employee employee = employeeService.findById(employeeId);
        model.addAttribute("employee", employee);
        return "employees/form";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") Integer employeeId, Model model){
        Employee employee = employeeService.findById(employeeId);
        employeeService.delete(employee);
        return "redirect:/employees/list";
    }

}
