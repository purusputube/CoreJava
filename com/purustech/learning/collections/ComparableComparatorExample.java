package com.purustech.learning.collections;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Punesh");
        e1.setSalary(new BigDecimal(4000));
        e1.setDeptNumber(5);
        e1.setAge(37);

        System.out.println("Employee e1 is " + e1);

        Employee e2 = new Employee();
        e2.setName("Abhishek");
        e2.setSalary(new BigDecimal(6000));
        e2.setDeptNumber(10);
        e2.setAge(32);

        Employee e3 = new Employee();
        e3.setName("Jay");
        e3.setSalary(new BigDecimal(2000));
        e3.setDeptNumber(6);
        e3.setAge(23);


        Employee e4 = new Employee();
        e4.setName("Mithesh");
        e4.setSalary(new BigDecimal(5000));
        e4.setDeptNumber(6);
        e4.setAge(23);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        System.out.println("List of employees before sorting: " + employeeList);

        Collections.sort(employeeList);
        System.out.println("After sorting employee list using Comparable: " + employeeList);

        Collections.sort(employeeList,new EmployeeSalaryComparator());
        System.out.println("After sorting employee list using Salary Comparator: " + employeeList);

        Collections.sort(employeeList,/* new EmployeeDepartmentComparator() */ Comparator.comparing(Employee::getDeptNumber) );
        System.out.println("After sorting employee list using department Comparator: " + employeeList);

        Comparator<Employee> multiComparator = Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary);
        Collections.sort(employeeList,multiComparator);

        System.out.println("After sorting employee list using multi Comparator: " + employeeList);
    }

}

// used to sort in natural order
class Employee  implements Comparable<Employee>  {

    private String name;
    private BigDecimal salary;
    private Integer age;
    private int deptNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(int deptNumber) {
        this.deptNumber = deptNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary.compareTo(o.salary);
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                "age='" + age + '\'' +
                ", salary=" + salary + '\'' +
                ", deptNumber=" + deptNumber +
                '}';
    }
}


class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getSalary().compareTo(e1.getSalary());
    }
}


class EmployeeDepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        /*
        if (e1.getDeptNumber() < e2.getDeptNumber())
            return -1;
        else if (e1.getDeptNumber() == e2.getDeptNumber())
            return 0;
        else
            return 1; */
        return Integer.compare(e1.getDeptNumber(), e2.getDeptNumber());
    }
}


class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getAge(), e2.getAge());
    }
}
