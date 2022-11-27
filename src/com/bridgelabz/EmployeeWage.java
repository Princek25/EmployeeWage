package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Main Branch");
        
        int empCheck = (int)Math.floor(Math.random()*10)%2;
        System.out.println(empCheck);
        if (empCheck==1){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
