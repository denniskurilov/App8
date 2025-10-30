package com.denniskurilov.app8.dao;

import com.denniskurilov.app8.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByOrderByIdAsc();
}
