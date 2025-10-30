package com.denniskurilov.app8.service;

import com.denniskurilov.app8.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void delete(Employee employee);
}
