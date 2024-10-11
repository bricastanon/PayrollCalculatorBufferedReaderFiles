package com.pluralsight;

public class Employee {
    public int employeeId;
    public String name;
    public double hoursWorked;
    public double payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }
    public int getemployeeId() {
        return employeeId;
    }

   public void setemployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double gethoursWorked() {
        return hoursWorked;
    }

    public void sethoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getpayRate() {
        return payRate;
    }

    public void setpayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay() {
        return hoursWorked * payRate;
    }


}
