package wk12.prep;

public class CharacterCountArray {
    public static void main(String[] args) {
        String msg = "hello how are you";

        Integer[] counts = new Integer[26];
        for(int i = 0; i<msg.length(); i++){
            Character letter = msg.charAt(i);
            if(Character.isLowerCase(letter)){
                int index = msg.charAt(i) - 97;
                if(counts[index] != null){
                    counts[index] += counts[index] + 1;
                } else {
                    counts[index] = 1;
                }
            }
        }
        for(int i = 0; i<counts.length; i++){
            if(counts[i] != null) {
                System.out.print((char) (i + 97));
                //System.out.print(i);
                System.out.println(" " + counts[i]);
            }
        }
    }
}
