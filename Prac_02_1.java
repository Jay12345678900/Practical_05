// Name: Jay Patel
// Roll-no: 21ce092

import java.io.*;

public class Prac_02_1 {
    public static void main(String[] args) throws IOException {
        FileReader source = null;
        try {
            source = new
                    FileReader("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\1.txt");
            int temp;
            while ((temp = source.read()) != -1)
                System.out.println((char) temp);
        }
        finally {
            if (source != null)
                source.close();
        }
    }
}
