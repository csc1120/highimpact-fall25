package wk5.review;

import java.io.*;

public class ReadAndWriteBinary {
    public static void main(String[] args) {

        //Low level classes to read/write bytes
        //FileInputStream/FileOutputStream
        //write(), read()

        //High level classes to read/write java primites
        //DataInputSTream/DataOutputStream
        //writeInt(), writeFloat(), readInt(), readFloat()

        //Object level classes to read/write java reference
        //ObjectInputStream/ObjectOutputStream
        //writeObject(), readObject()

        int[] nums = {1, 2, 3, 4, 5};
        double[] nums2 = {3.14, 0.99, -1.2};

        String filename = "data/nums1.bin";

        try(FileOutputStream out = new FileOutputStream(filename);
        DataOutputStream dOut = new DataOutputStream(out)){
            for(int i = 0; i<nums.length; i++){
                dOut.writeInt(nums[i]);
            }
            for(int i = 0; i<nums2.length; i++){
                dOut.writeDouble(nums2[i]);
            }
        } catch (IOException e){
            System.out.println("Error saving to file "+filename);
        }

        try(FileInputStream in = new FileInputStream(filename);
        DataInputStream dIn = new DataInputStream(in)){
            int numValues1= 5;
            int numValue2 = 3;
            double sum = 0;
            for(int i = 0; i<numValues1; i++){
                sum += dIn.readInt();
            }
            for(int i = 0; i<numValue2; i++){
                sum += dIn.readDouble();
            }
            System.out.println("sum is " + sum);
        } catch (IOException e){
            System.out.println("Error reading file "+filename);
        }





    }
}
