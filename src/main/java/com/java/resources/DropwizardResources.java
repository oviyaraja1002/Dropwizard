package com.java.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/employee_table")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)


public class DropwizardResources {

    private EmployeeService employeeService;

    public DropwizardResources(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GET
    public Response getEmployee() {
        return Response.ok().entity(this.employeeService.getEmployee()).build();
    }

    @GET
    @Path("/{emp_id}")
    public Response getEmployee1(@PathParam("emp_id") final int emp_id) {
        System.out.println("emp_id is " + emp_id);
        return Response.ok().entity(this.employeeService.getEmployee1(emp_id)).build();
    }
}


