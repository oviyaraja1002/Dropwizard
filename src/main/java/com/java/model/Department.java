package com.java.model;

public class Department
{
    int dept_no;
    String dname;
    String location;
    @Override
    public String toString() {
        return "Department{" +

                "deptId=" + dept_no +
                ", deptName='" + dname + ", location='" + location + '\'' +
                '}';
    }
    public int getdept_no() {
        return dept_no;
    }
    public void setdept_no(int dept_no) {
        this.dept_no = dept_no;
    }
    public String getdname() {
        return dname;
    }
    public void setdname(String dname) {

        this.dname = dname;
    }
    public String getlocation() {
        return location;
    }
    public void setlocation(String location) {

        this.location = location;
    }
    public Department(int dept_no, String dname,String location) {
        this.dept_no = dept_no;
        this.dname = dname;
        this.location = location;
    }

}
