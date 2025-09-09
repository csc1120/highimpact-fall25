package wk2;

public class CommisionedEmployee extends Employee{
    private double percent;
    public CommisionedEmployee(String name, int age, int id, double percent){
        super(name, age, id);
        this.percent = percent;
    }
    public double getPay(){
        return percent * 100;
    }

}
