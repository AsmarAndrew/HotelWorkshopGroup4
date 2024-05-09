package org.example;
import java.time.LocalDateTime;
import java.util.List;

public class Employee {
    private int employeeID;

    private String name;

    private String department;

    private double payRate;

    private double hoursWorked;

    private LocalDateTime punchInTime;

    private LocalDateTime punchOutTime;

    private double totalHoursWorked;

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
    public void punchTimeCard(){
        if (punchInTime == null){
            punchIn();
        }else if (punchOutTime == null)
            punchOut();
    }
    public void punchIn(){
        punchInTime = LocalDateTime.now();
        System.out.println("Punched in at: " + punchInTime);
    }
    public void punchOut(){
        punchOutTime = LocalDateTime.now();
        System.out.println("Punched out at: " + punchOutTime);
        calculateHoursWorked();
    }
    private void calculateHoursWorked(){
        double minutesWorked = java.time.Duration.between(punchInTime,punchOutTime).toMinutes();
        totalHoursWorked += minutesWorked /60.0;

        punchInTime = null;
        punchOutTime = null;
    }

}
