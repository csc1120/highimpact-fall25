package wk14.prep;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class GenerateHours {
    public static void main(String[] args) {
        File file = new File("data/letters.txt");
        List<String> lines = new ArrayList<>();
        try(Scanner fileIn = new Scanner(file)){
            while(fileIn.hasNextLine()){
                lines.add(fileIn.nextLine());
            }
        } catch (IOException e){
            System.out.println("Can't read file");
        }
        System.out.println(lines);
        TreeMap<String, Double> map = new TreeMap();
        String[] tokens = lines.get(0).split(":"); //Leela:20
        map.put(tokens[0],Double.parseDouble(tokens[1]));
        System.out.println(map);
        if(map.containsKey("Leela")) {
            map.put("Leela", map.get("Leela") + 5.0);
            System.out.println(map);
        }


    }
}
