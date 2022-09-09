package io.codelex.arithmetic.practice;

public class EmployeeSalaries {
    public static void main(String[] args) {
        salaryCalculator(7.5, 35);
        salaryCalculator(8.2, 47);
        salaryCalculator(10,73);
    }
    public static void salaryCalculator(double basepay,int hours ){
        double salary = 0;
        if(hours <= 40){
            salary = basepay * hours;
            System.out.println("The salary is : $" + String.format("%.2f",salary) );
        }else if(hours <= 60){
            salary = (basepay * (hours - 40)) + (hours  * (basepay * 1.5));
            System.out.println("The salary is : $" + String.format("%.2f",salary) );
        }else {
            System.out.println("Too Many Hours!");

        }


    }


}
