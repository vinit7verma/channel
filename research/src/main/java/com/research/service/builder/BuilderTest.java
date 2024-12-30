package com.research.service.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Employee emp = Employee.builder().empAge("10").empId("1").build();
        System.out.println(emp);
    }
}

class Employee {
    private String empId;
    private String empName;
    private String empDept;
    private String empSalary;
    private String empAge;

    @Override
    public String toString() {
        return this.empId + " " + this.empDept + " " + this.empAge + " " + this.empSalary + " " + this.empName;
    }

    private Employee(EmployeeBuilder builder) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.empDept = builder.empDept;
        this.empSalary = builder.empSalary;
        this.empAge = builder.empAge;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private String empId;
        private String empName;
        private String empDept;
        private String empSalary;
        private String empAge;

        public EmployeeBuilder empId(String empId) {
            this.empId = empId;
            return this;
        }

        public EmployeeBuilder empName(String empName) {
            this.empName = empName;
            return this;
        }

        public EmployeeBuilder empDept(String empDept) {
            this.empDept = empDept;
            return this;
        }

        public EmployeeBuilder empSalary(String empSalary) {
            this.empSalary = empSalary;
            return this;
        }

        public EmployeeBuilder empAge(String empAge) {
            this.empAge = empAge;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
