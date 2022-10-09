// Name: Jay Patel
// Roll-no: 21ce092

import java.io.*;

public class Prac_04_2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new
                FileInputStream("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\1.txt");
            fos = new FileOutputStream
                ("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\2.txt");
            int temp;
            while ((temp = fis.read()) != -1) //read byte by byte
                fos.write((byte)temp); //write byte by byte
            if (fis != null)
                fis.close();
            if (fos != null)
                fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
