package model;

import java.util.Date;

public class Employee {
    private int emp_id;
    private String emp_name;
    private String DOB;
    private int Age;
    private String Place;
    private int Mobile;
    private int dept_no;

    @Override
    public String toString() {
        return "EmployeeApplication{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", dob='" + DOB + '\'' +
                ", Age=" + Age +
                ", Place='" + Place + '\'' +
                ", Mobile='" + Mobile + '\'' +
                ", dept_no=" + dept_no +
                '}';
    }

    public Employee(int emp_id, String emp_name, String DOB, int Age, String Place, int Mobile, int dept_no) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.Age = Age;
        this.Place = Place;
        this.DOB = DOB;
        this.Mobile = Mobile;
        this.dept_no = dept_no;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getDOB() {
        return DOB;
    }

    public int getAge() {
        return Age;
    }

    public String getPlace() {
        return Place;
    }

    public int getMobile() {
        return Mobile;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public void setMobile(int mobile) {
        Mobile = mobile;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }
}
