package wk8;

public class TestMyArrayList2 {
    public static void main(String[] args) {
        MyArrayList<Integer> nums = new MyArrayList<>();
        nums.add(8);
        nums.add(4);
        nums.add(7);
        nums.add(6);
        nums.add(5);
        nums.add(4);
        System.out.println(nums.size());
        nums.remove(1);
        System.out.println(nums.size());
        for(int i = 0; i<nums.size();i++){
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        nums.add(42, 1);
        for(int i = 0; i<nums.size();i++){
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();

    }
}
