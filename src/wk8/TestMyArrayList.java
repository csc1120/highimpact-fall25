package wk8;

public class TestMyArrayList {
    public static void main(String[] args) {
        MyArrayList<Integer> nums = new MyArrayList<>();
        System.out.println(nums.size());
        nums.add(42);
        nums.add(99);
        nums.add(0);
        System.out.println(nums.size());
        for(int i = 0; i<nums.size(); i++){
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        nums.add(-1);
        nums.add(-2);


        for(int i = 0; i<100; i++){
            nums.add(i);
        }
        for(int i = 0; i<nums.size(); i++){
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();

    }
}
