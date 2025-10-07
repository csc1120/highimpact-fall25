package wk5.review;

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteExample {
    public static void main(String[] args) {
        String filename = "data/nums1.txt";
        int sum = 0;
        try {
            FileInputStream in = new FileInputStream(filename);
            Scanner fileIn = new Scanner(in);
            while(fileIn.hasNext()){
                String token = fileIn.next();
                try {
                    sum += Integer.parseInt(token);
                } catch (NumberFormatException e){
                    System.out.println("Can't parse the token "+token);
                }
            }
            System.out.println("The sum is "+sum);
        } catch (IOException e){
            System.out.println("Error reading the file "+filename);
        }
        String outFilename = "data/output.txt";
        int[] nums = {1, 2, 3, 4, 5};
        try(FileOutputStream out = new FileOutputStream(outFilename);
            PrintWriter printWriter = new PrintWriter("data/output.txt")) {
            for(int i = 0; i<nums.length + 1; i++){
                printWriter.print(nums[i] +" ");
            }
            //printWriter.close();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error with the array");
        } catch (IOException e){
            System.out.println("Error opening file "+outFilename);
        }
    }
}
