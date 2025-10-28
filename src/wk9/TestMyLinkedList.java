package wk9;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> names = new MyLinkedList<>();
        System.out.println(names.size());
        names.add("Sam");
        System.out.println(names.size());
        names.add("Jamie");
        names.add("Bill");
        names.add("May");
        System.out.println(names.size());

        for(int i = 0; i<names.size(); i++){
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.remove(2);
        for(int i = 0; i<names.size(); i++){
            System.out.print(names.get(i) + " ");
        }
        System.out.println();

        names.remove(0);
        for(int i = 0; i<names.size(); i++){
            System.out.print(names.get(i) + " ");
        }
        System.out.println();


    }
}
