package com.concept.service.builder;

public class BuilderWithPreferenceTest {
    public static void main(String[] args) {
        Employee1 emp = Employee1.builder().empId("1").empAge("20").empDept("IT").build();
        System.out.println(emp);
    }
}

class Employee1 {
    private String empId;
    private String empName;
    private String empDept;
    private String empSalary;
    private String empAge;

    @Override
    public String toString() {
        return this.empId + " " + this.empDept + " " + this.empAge + " " + this.empSalary + " " + this.empName;
    }

    private Employee1(EmployeeBuilder2 builder) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.empDept = builder.empDept;
        this.empSalary = builder.empSalary;
        this.empAge = builder.empAge;
    }

    public static EmployeeBuilder1 builder() {
        return new EmployeeBuilder1();
    }

    public static class EmployeeBuilder1 {
        private String empId;

        public EmployeeBuilder2 empId(String empId) {
            this.empId = empId;
            return new EmployeeBuilder2(this);
        }
    }

    public static class EmployeeBuilder2 {
        private String empId;
        private String empName;
        private String empDept;
        private String empSalary;
        private String empAge;

        public EmployeeBuilder2(EmployeeBuilder1 employeeBuilder1) {
            this.empId = employeeBuilder1.empId;
        }

        public EmployeeBuilder2 empName(String empName) {
            this.empName = empName;
            return this;
        }

        public EmployeeBuilder2 empDept(String empDept) {
            this.empDept = empDept;
            return this;
        }

        public EmployeeBuilder2 empSalary(String empSalary) {
            this.empSalary = empSalary;
            return this;
        }

        public EmployeeBuilder2 empAge(String empAge) {
            this.empAge = empAge;
            return this;
        }

        public Employee1 build() {
            return new Employee1(this);
        }
    }
}
