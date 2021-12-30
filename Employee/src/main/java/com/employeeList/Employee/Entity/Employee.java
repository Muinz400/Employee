package com.employeeList.Employee.Entity;

public class Employee {
    private int id;
    private String first_Name;
    private String last_Name;

    public Employee(String first_Name, String last_Name, String role) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.role = role;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String role;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}


