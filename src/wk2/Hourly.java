package wk2;

public class Hourly extends Employee {
    private double rate;
    private int hours;
    public Hourly(String name, int age, int id, double rate){
        super(name, age, id);
        this.rate = rate;
        this.hours = 0;
    }
    public void addHours(int hours){
        this.hours += hours;
    }
    public double getPay(){
        return rate * hours;
    }

}
