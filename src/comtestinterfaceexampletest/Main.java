package comtestinterfaceexampletest;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] tab = new int[3];
        tab[0] = 10;
        tab[1] = -4;
        tab[2] = 40;

        Arrays.sort(tab);
        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);

        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1000);
        employees[1] = new Employee(200);
        employees[2] = new Employee(10);


        System.out.println(employees[0].compareTo(employees[1]));
        System.out.println("Salary before sort");
        System.out.println(employees[0].getSalary());
        System.out.println(employees[1].getSalary());
        System.out.println(employees[2].getSalary());

        Arrays.sort(employees);
        System.out.println("Salary after sort");
        System.out.println(employees[0].getSalary());
        System.out.println(employees[1].getSalary());
        System.out.println(employees[2].getSalary());


        System.out.println(nameInterface.PI);

    }
}

interface nameInterface{

    double PI = 3.14;

    void something();
}

interface somethingsTwo{

}

class Employee implements nameInterface, somethingsTwo, Comparable {

    Employee(double salary){
        this.salary = salary;
    }
    @Override
    public void something() {
    }

    private double salary;

    public double getSalary(){
        return this.salary;
    }

    @Override
    public int compareTo(Object o) {

        Employee sent = (Employee)o;
        if (this.salary < sent.salary){
            return -1;
        }
        if (this.salary > sent.salary){
            return 1;
        }
        return 0;
    }
}

class A{

}
