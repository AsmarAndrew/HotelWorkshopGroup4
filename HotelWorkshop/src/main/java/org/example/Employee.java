package org.example;

import java.util.List;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private List<String> employees;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked, List<String> employees) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.employees = employees;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours(){
        double standardWeekHours = 40;
        if (hoursWorked <= standardWeekHours){
            return hoursWorked;
        }
        else return standardWeekHours;
    }

    public double getOvertimeHours(){
        double standardWeekHours = 40;
        if (hoursWorked > standardWeekHours){
            return hoursWorked - standardWeekHours;
        }
        else{
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overTimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overTimePay;
    }
}
