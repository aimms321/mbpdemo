package com.example.mbpdemo.demo.service.impl;

import com.example.mbpdemo.demo.model.Employee;
import com.example.mbpdemo.demo.mapper.EmployeeMapper;
import com.example.mbpdemo.demo.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author K神带你飞
 * @since 2018-08-03
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
