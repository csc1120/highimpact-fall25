package wk12.prep;

import java.util.TreeMap;

public class CharacterCount {
    public static void main(String[] args) {
        String msg = "hello how are you";

        TreeMap<Character, Integer> counts = new TreeMap<>();
        for(int i = 0; i<msg.length(); i++){
            Character letter = msg.charAt(i);
            if(counts.get(letter) != null){
                int currentCount = counts.get(letter);
                counts.put(letter, currentCount + 1);
            } else {
                counts.put(letter, 1);
            }
        }
        System.out.println(counts);
    }
}
