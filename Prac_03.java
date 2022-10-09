// Name: Jay Patel
// Roll-no: 21ce092

import java.io.*;

public class Prac_03 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new
                    FileInputStream("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\1.txt");
            out = new
                    FileOutputStream("E:\\TURBOC3\\BIN\\21CE092_Java\\Practical_05\\2.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch(IOException ie) {
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
