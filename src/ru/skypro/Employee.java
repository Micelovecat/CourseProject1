package ru.skypro;

import java.util.Objects;

public class Employee {
    private static int counter = 1;

    private int id;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private int department;
    private float salary;

    public Employee(String firstName, String lastName, String middleName, int department, float salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + middleName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(float salary){
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && firstName.equals(employee.firstName) && lastName.equals(employee.lastName) && middleName.equals(employee.middleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }
}
