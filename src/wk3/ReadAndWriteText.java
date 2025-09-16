package wk3;

import java.io.*;
import java.util.Scanner;

public class ReadAndWriteText {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        //String filename = "C:\\Users\\velez\\OneDrive - Milwaukee School of Engineering\\IntelliJ\\AY2026\\highimpact-fall25\\data\\folder1\\folder2\\nums2.txt";
        //relative path
        String filename = "data/folder1/folder2/nums1.txt";
        WriteArray(filename, numbers);
        int sum = SumValues(filename);
        System.out.println("Sum is "+sum);
    }
    private static int SumValues(String filename){
        int sum = 0;
        try(FileInputStream in = new FileInputStream(filename);
            Scanner fileIn = new Scanner(in)) {
            while(fileIn.hasNextInt()) {
                sum += fileIn.nextInt();
            }
        } catch (IOException e){
            System.out.println("Error opening the file "+filename);
        }
        return sum;
    }
    private static void WriteArray(String filename, int[] numbers){
        try(FileOutputStream out = new FileOutputStream(filename);
            PrintWriter pw = new PrintWriter(out)) {

            for (int i = 0; i < numbers.length; i++) {
                pw.print(numbers[i] + " ");
            }
            pw.println();
            //pw.close();
        } catch (IOException e){
            System.out.println("Error writting to file "+filename);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error with the index");
        }
    }
}
