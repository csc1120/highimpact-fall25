package wk2;

public abstract class Employee extends Person {
    private final int id;
    public Employee(String name, int age, int id){
        super(name, age);
        this.id = id;
    }
    @Override
    public String getName(){
        return super.getName() + ":" + id;
    }

    public int getID(){
        return id;
    }

    public void display(){
        System.out.println(this.getName());
        System.out.println(super.getName());
    }
    public abstract double getPay();

}
