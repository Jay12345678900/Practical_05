// Name: Jay Patel
// Roll-no: 21ce092

import java.io.*;

public class Prac_02_2 {
    public static void main(String[] args) throws IOException
    {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try
        {
            sourceStream = new
                    FileInputStream("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\1.txt");
            targetStream = new FileOutputStream
                    ("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\2.txt");
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);
        }
        finally
        {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }
}
