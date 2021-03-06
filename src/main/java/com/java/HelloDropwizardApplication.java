package com.java;


import com.java.db.DepartmentDAO;
import com.java.db.EmployeeDAO;
import com.java.resources.DepartmentResources;
import com.java.resources.DepartmentService;
import com.java.resources.DropwizardResources;
import com.java.resources.EmployeeService;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class HelloDropwizardApplication extends Application<HelloDropwizardConfiguration> {
    public static void main(String[] args) throws Exception {
        new HelloDropwizardApplication().run(args);
    }

    public void run(HelloDropwizardConfiguration configuration, Environment environment) throws Exception {
        final DBIFactory dbiFactory = new DBIFactory();
        final DBI dbi = dbiFactory.build(environment, configuration.getDataSourceFactory(), "mysql");
        final EmployeeDAO employeeDAO = dbi.onDemand(EmployeeDAO.class);
        final EmployeeService employeeService = new EmployeeService(employeeDAO);

        final DropwizardResources employeeResources = new DropwizardResources(employeeService);
        environment.jersey().register(employeeResources);
        final DepartmentDAO departmentDAO=dbi.onDemand(DepartmentDAO.class);

        final DepartmentService departmentService=new DepartmentService(departmentDAO);



        final DepartmentResources departmentResources=new DepartmentResources(departmentService);

        environment.jersey().register(departmentResources);
    }
}


