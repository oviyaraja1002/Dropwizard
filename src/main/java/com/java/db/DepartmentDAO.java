package com.java.db;

import com.java.model.Department;
import com.java.resources.DepartmentMapper;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;


import java.util.List;


@RegisterMapper(DepartmentMapper.class)

public interface DepartmentDAO {


    @SqlQuery("select * from `dept_table`")
    public List<Department> getDepartment();

}

