package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void getRegular_Hours32_Return32(){
        Employee employee = new Employee(1242,"Bob","Food",12.5,32);

        var result = employee.getRegularHours();

        assertEquals(32,result);
    }

    @Test
    public void getOverTime_Hours42_Return2(){
        Employee employee = new Employee(1242,"Bob","Food",12.5,42);

        var result = employee.getOvertimeHours();

        assertEquals(2,result);
    }

    @Test
    public void getTotalPay_PayRate15_Hours40_Return600(){
        Employee employee = new Employee(1242,"Bob","Food",15,40);

        var result = employee.getTotalPay();

        assertEquals(600,result);
    }

    @Test
    public void getTotalPay_PayRate15_Hours32_Return480(){
        Employee employee = new Employee(1242,"Bob","Food",15,32);

        var result = employee.getTotalPay();

        assertEquals(480,result);
    }

    @Test
    public void getTotalPay_PayRate15_Hours45_Return712_5(){
        Employee employee = new Employee(1242,"Bob","Food",15,45);

        var result = employee.getTotalPay();

        assertEquals(712.5,result);
    }





}