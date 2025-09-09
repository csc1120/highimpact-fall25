package wk2;

import java.util.ArrayList;

public class PersonDriver {
    public static void main(String[] args) {
        Person p1 = new Person("Steve", 42);
        //Employee e1 = new Employee("Bob", 24, 1);

        System.out.println(p1.getName());
        //System.out.println(e1.getName());

        //e1.display();
        Person p2 = new Person("Jill", 26);
        //Person p3 = new Employee("Jack", 50, 2);

        ArrayList<Person> people = new ArrayList<>();
        people.add(p2);
        //people.add(p3);

        for(Person p:people){
            System.out.println(p.getName());
            if(p instanceof Employee){
                System.out.println(((Employee)p).getID());
            }
        }
    }
}
