package com.java.resources;

import com.java.model.Employee;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements ResultSetMapper<Employee> {
    public Employee map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

        Employee employee = new Employee(
                resultSet.getInt("emp_id"),
                resultSet.getString("emp_name"),
                resultSet.getString("dOB"),
                resultSet.getInt("age"),
                resultSet.getString("place"),
                resultSet.getInt("mobile"),
                resultSet.getInt("dept_no")
        );
        return employee;
    }
}

