package com.java.resources;

import com.java.model.Employee;

import javax.validation.constraints.NotNull;
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
    @Path("/{empid}")
    public Response getEmploye(@PathParam("empid") final int empid) {
        System.out.println("empid is " + empid);
        return Response.ok().entity(this.employeeService.getEmploye(empid)).build();
    }
    @POST
    public Response insert(final @NotNull Employee employee) {
        this.employeeService.insert(employee);
        return Response.ok().build();
    }
    @PUT
    @Path("{id}")
    public Response editEmploye(final @NotNull Employee employee,@PathParam("id")final int id)
    {
        return Response.ok().entity(this.employeeService.editEmploye(employee)).build();
    }
    @DELETE
    @Path("{id}")
    public Response deleteEmployee(@PathParam("id")final int id)
    {
        return Response.ok().entity(this.employeeService.deleteEmployee(id)).build();
    }
}


