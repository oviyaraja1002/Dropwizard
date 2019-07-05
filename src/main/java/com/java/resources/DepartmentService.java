package com.java.resources;

import com.java.db.DepartmentDAO;
import com.java.model.Department;

import java.util.List;

public class DepartmentService {

    private DepartmentDAO departmentDAO;

    public DepartmentService(final DepartmentDAO departmentDAO) {

        this.departmentDAO = departmentDAO;

    }


    public List<Department> getDepartment() {

        return this.departmentDAO.getDepartment();

    }

}

