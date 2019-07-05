package com.java.resources;

import com.java.db.EmployeeDAO;
import com.java.model.Employee;

import java.util.List;

public class EmployeeService {
    private EmployeeDAO employeeDAO;

    public EmployeeService(final EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> getEmployee()
    {
        return this.employeeDAO.getEmployee();
    }

    public Employee getEmploye(final int empid) {

        return this.employeeDAO.getEmploye(empid);
    }

        public void insert (Employee employee)
        {
            this.employeeDAO.insert(employee);
        }

        public Employee editEmploye(Employee employee)
        {
            this.employeeDAO.editEmploye(employee);
            return this.employeeDAO.getEmploye(Integer.parseInt(String.valueOf(employee.getemp_id())));
        }
        public int deleteEmployee(int id)
        {
            return this.employeeDAO.deleteEmployee(id);
        }
    }


