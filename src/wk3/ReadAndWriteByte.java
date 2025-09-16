package wk3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteByte {
    public static void main(String[] args) {
        String filename = "data/nums2.bin";
        try (FileOutputStream out = new FileOutputStream(filename)) {
            byte[] numbers = {1, 42, 3, 4, 5};

            for (int i = 0; i < numbers.length; i++) {
                out.write(numbers[i]);
            }
        } catch (IOException e){
            System.out.println("Errror writing to file "+filename);
        }

        try(FileInputStream in = new FileInputStream(filename)){
            byte[] values = new byte[5];
            in.read(values);
//            for(int i = 0; i<5; i++) {
//                System.out.println(in.read());
//            }
            for(int i = 0; i<values.length; i++){
                System.out.println(values[i]);
            }
        } catch (IOException e){
            System.out.println("Error opening filen "+filename);
        }
    }
}
