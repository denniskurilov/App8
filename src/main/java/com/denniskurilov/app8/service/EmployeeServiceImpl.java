package com.denniskurilov.app8.service;

import com.denniskurilov.app8.dao.EmployeeRepository;
import com.denniskurilov.app8.entity.Employee;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        //return employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
        return employeeRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Employee not found (id=" + id + ")"));
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
