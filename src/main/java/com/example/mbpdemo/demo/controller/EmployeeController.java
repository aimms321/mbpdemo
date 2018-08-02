package com.example.mbpdemo.demo.controller;


import com.example.mbpdemo.demo.model.Employee;
import com.example.mbpdemo.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author K神带你飞
 * @since 2018-08-03
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/selectEmployeeById")
    public Employee selectEmployee(Integer id) {
        Employee employee = employeeService.getById(id);
        return employee;
    }

}

