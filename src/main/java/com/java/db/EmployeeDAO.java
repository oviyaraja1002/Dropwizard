package com.java.db;

import com.java.resources.EmployeeMapper;
import model.Employee;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;
@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDAO
{
    @SqlQuery("select * from  `employee_table` ")
    public List<Employee> getEmployee();

    @SqlQuery("select * from `employee_table` where emp_id= :emp_id")
    public Employee getEmployee1(@Bind("emp_id") final int emp_id);

}
