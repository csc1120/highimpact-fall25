package wk3;

import java.io.*;

public class ReadAndWriteData {
    public static void main(String[] args) {
        String filename = "data/data.bin";
        try(FileOutputStream out = new FileOutputStream(filename);
        DataOutputStream dOut = new DataOutputStream(out)) {
            dOut.writeInt(1000);
            dOut.writeDouble(3.14);
            dOut.writeBoolean(false);
        } catch (IOException e){
            System.out.println("Error writing");
        }
        try(FileInputStream in = new FileInputStream(filename);
            DataInputStream dIn = new DataInputStream(in)){
            System.out.println(dIn.readInt());
            System.out.println(dIn.readDouble());
            System.out.println(dIn.readBoolean());

        } catch (IOException e){
            System.out.println("Error reading file");
        }
    }
}
