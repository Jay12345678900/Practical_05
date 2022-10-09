// Name: Jay Patel
// Roll-no: 21ce092

import java.io.*;

public class Prac_04_1 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new
                    FileReader("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\1.txt");
            int fChar;
            while ((fChar = reader.read()) != -1) //read char by char

            System.out.println((char)fChar); //write char char
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
