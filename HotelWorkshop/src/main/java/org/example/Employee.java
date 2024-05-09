package org.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalDateTime punchInTime;
    private LocalDateTime punchOutTime;

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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

    public LocalDateTime getPunchInTime() {
        return punchInTime;
    }

    public void setPunchInTime(LocalDateTime punchInTime) {
        this.punchInTime = punchInTime;
    }

    public LocalDateTime getPunchOutTime() {
        return punchOutTime;
    }

    public void setPunchOutTime(LocalDateTime punchOutTime) {
        this.punchOutTime = punchOutTime;
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

    public void punchTimeCard(boolean punchIn){
        if(punchIn){
            punchInTime = LocalDateTime.now();
        }else {
            punchInTime = LocalDateTime.now();
            calculateHoursWorked();
        }
    }

    private void calculateHoursWorked(){
        Duration duration = Duration.between(punchInTime, punchOutTime);
        double hours = (double)duration.toHours();
        double min = (double) duration.toMinutes() / 60;
        double total = hours + min;
        if (punchOutTime != null && punchInTime != null){
            hoursWorked += total;
        }
    }
}
