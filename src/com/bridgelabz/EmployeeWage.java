package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOURS = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Main Branch");
        int empCheck = (int)Math.floor(Math.random()*10)%3;
        System.out.println(empCheck);
        int empWage = 0;

        switch (empCheck){
            case IS_FULL_TIME:
                System.out.println("Employee is Full Time");
                empWage = WAGE_PER_HOUR*FULL_DAY_HOURS;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Part Time");
                empWage = WAGE_PER_HOUR*PART_TIME_HOURS;
                break;
            default: System.out.println("Employee is Absent");
        }
        System.out.println("Employee Wage:- " + empWage);
    }
}
