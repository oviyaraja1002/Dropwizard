package com.java.db;

import com.java.model.Employee;
import com.java.resources.EmployeeMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(EmployeeMapper.class)
public interface EmployeeDAO {
    @SqlQuery("select * from  `employee_table` ")
    public List<Employee> getEmployee();

    @SqlQuery("select * from `employee_table` where emp_id= :emp_id")
    public Employee getEmploye(@Bind("emp_id") final int emp_id);

    @SqlUpdate("INSERT INTO `employee_table` (`emp_id`,`emp_name`,`dOB`,`age`,`place`,`mobile`,`dept_no`) VALUES (:emp_id , :emp_name, :dOB, :age, :place, :mobile, :dept_no );")
    public void insert(@BindBean Employee employee);

    @SqlUpdate("update employee_table set emp_name = coalesce(:emp_name ,emp_name) where emp_id= :emp_id")

    void editEmploye(@BindBean Employee employee);

    @SqlUpdate("delete from employee_table where emp_id= :emp_id")

    int deleteEmployee(@Bind("id")final int id);

}
