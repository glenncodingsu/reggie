package com.it.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.reggie.entity.Employee;
import com.it.reggie.mapper.EmployeeMapper;
import com.it.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/14 20:28
 **/

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
