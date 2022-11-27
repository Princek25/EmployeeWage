package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Main Branch");
        int empCheck = (int)Math.floor(Math.random()*10)%2;
        System.out.println(empCheck);
        int empWage = 0;

        if (empCheck==1){
            System.out.println("Employee is Present");
            empWage = WAGE_PER_HOUR*FULL_DAY_HOURS;
        }
        else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee Wage:- " + empWage);
    }
}
