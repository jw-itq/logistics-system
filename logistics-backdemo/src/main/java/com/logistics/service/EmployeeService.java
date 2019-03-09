package com.logistics.service;

import com.logistics.pojo.Employee;
import com.logistics.util.Result;
import org.springframework.web.bind.annotation.PathVariable;

public interface EmployeeService {

    public Result selectAllEmp(int pageNum,int limit);

    public String addNewEmp(Employee employee,int condition);

    public Employee selectEmpByCode(String employeeCode);

    public String updateEmp(String employeeCode, Employee employee, int condition);

    public String deleteEmpByCode(String employeeCode);
}
