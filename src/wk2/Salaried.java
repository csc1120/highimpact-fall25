package wk2;

public class Salaried extends Employee {
    private double salary;
    public Salaried(String name, int age, int id, double salary){
        super(name, age, id);
        this.salary = salary;
    }
    public void raise(){
        this.salary = salary * 1.1;
    }
    public double getPay(){
        return salary/24.0;
    }

}
