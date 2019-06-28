package com.java.resources;

import com.java.db.EmployeeDAO;
import model.Employee;

import java.util.List;
public class EmployeeService
 {
     private EmployeeDAO employeeDAO;
     public EmployeeService(final EmployeeDAO employeeDAO)
     {
         this.employeeDAO=employeeDAO;
         }
         public List<Employee> getEmployee()
         {
             return this.employeeDAO.getEmployee();
         }
         public Employee getEmployee1(final int emp_id)
         {
             System.out.println("emp_id is" + emp_id);
             return this.employeeDAO.getEmployee1(emp_id);
         }

 }

