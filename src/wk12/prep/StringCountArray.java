package wk12.prep;

public class StringCountArray {
    public static int myStringHash1(String s){
        return s.length();
    }
    public static void main(String[] args) {
        String msg = "hello how is your day";

        Integer[] counts = new Integer[26];
        String[] words = msg.split("\\s+");

        for(int i = 0; i<words.length; i++){
            int count = 1;
            int index = myStringHash1(words[i]);
            if(counts[index] != null){
                counts[index] = counts[index] + count;
            } else {
                counts[index] = count;
            }
        }
        for(int i = 0; i<counts.length; i++){
            if(counts[i] != null) {
                System.out.print(i);
                System.out.println(" " + counts[i]);
            }
        }
    }
}
