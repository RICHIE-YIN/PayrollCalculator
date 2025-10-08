package com.pluralsight;

public class Employee {

    private int EmployeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee (int employeeId, String name, double hoursWorked, double payRate) {
        this.EmployeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay(double hoursWorked, double payRate) {
        return hoursWorked * payRate;
    }
}
