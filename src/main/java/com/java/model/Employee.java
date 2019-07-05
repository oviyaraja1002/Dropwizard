package com.java.model;

public class Employee
{
        private int emp_id;
        private String emp_name;
        private String dOB;
        private int age;
        private String place;
        private int mobile;
        private int dept_no;

        public Employee()
        {

        }
        @Override
        public String toString() {
            return "EmployeeApplication{" +
                    "emp_id=" + emp_id +
                    ", emp_name='" + emp_name + '\'' +
                    ", DOB='" + dOB + '\'' +
                    ", Age=" + age +
                    ", Place='" + place + '\'' +
                    ", Mobile='" + mobile + '\'' +
                    ", dept_no=" + dept_no +
                    '}';
        }

        public Employee(int emp_id, String emp_name, String DOB, int Age, String Place, int Mobile, int dept_no) {
            this.emp_id = emp_id;
            this.emp_name = emp_name;
            this.age = Age;
            this.place = Place;
            this.dOB = DOB;
            this.mobile = Mobile;
            this.dept_no = dept_no;
        }

    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public String getdOB() {
        return dOB;
    }

    public int getAge() {
        return age;
    }

    public String getPlace() {
        return place;
    }

    public int getMobile() {
        return mobile;
    }

    public int getDept_no() {
        return dept_no;
    }
}


