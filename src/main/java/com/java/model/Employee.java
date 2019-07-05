package com.java.model;

public class Employee
{
        private int emp_id;
        private String emp_name;
        private String DOB;
        private int Age;
        private String Place;
        private int Mobile;
        private int dept_no;

        public Employee()
        {

        }
        @Override
        public String toString() {
            return "EmployeeApplication{" +
                    "emp_id=" + emp_id +
                    ", emp_name='" + emp_name + '\'' +
                    ", DOB='" + DOB + '\'' +
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
        public int getemp_id() {

            return emp_id;
        }
        public void setemp_id(int emp_id) {

            this.emp_id = emp_id;
        }

        public String getemp_name() {

            return emp_name;
        }
        public void setEmp_name(String emp_name) {

            this.emp_name = emp_name;
        }

        public String getDOB() {

            return DOB;
        }
        public void setDOB(String DOB) {

           this.DOB = DOB;
        }

        public int getAge() {

            return Age;
        }
        public void setAge(int age) {

            this.Age = age;
        }

        public String getPlace() {

            return Place;
        }
        public void setPlace(String place) {

            this.Place = place;
        }

        public int getMobile() {

            return Mobile;
        }
        public void setMobile(int mobile) {

            this.Mobile = mobile;
        }

        public int getdept_no() {

            return dept_no;
        }
        public void setDept_no(int dept_no) {

            this.dept_no = dept_no;
        }
    }


