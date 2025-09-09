package wk2;

import java.util.ArrayList;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1;

        //e1 = new Employee("Sally", 34, 3);
        e1 = new Salaried("Jill", 42, 2, 45_000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Salaried("Jill", 42, 2, 45_000));
        employees.add(new Hourly("Max", 25, 1, 17));
        employees.add(new Hourly("Sam", 33, 4, 20));
        employees.add(new CommisionedEmployee("Mich", 35, 3, 0.15));
        double payroll = 0;

        for(Employee e: employees){
            if(e instanceof Hourly){
                ((Hourly) e).addHours(10);
            } else if(e instanceof Salaried){
                ((Salaried) e).raise();
            }
        }

        for(Employee e: employees){
            payroll += e.getPay();
        }


    }
}
