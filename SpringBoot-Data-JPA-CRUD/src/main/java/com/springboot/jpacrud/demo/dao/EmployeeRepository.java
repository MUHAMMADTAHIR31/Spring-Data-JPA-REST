/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.jpacrud.demo.dao;

import com.springboot.jpacrud.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
