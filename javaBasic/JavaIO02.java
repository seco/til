package self.javaWebProgrammingSchool.basic;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;


public class JavaIO02 {
    public static void main(String[] args)  throws Exception {
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream("bytearray.dat");
            out = new ByteArrayOutputStream();
            int readBuffer = -1;
            while((readBuffer = in.read()) != -1) {
                out.write(readBuffer);
            }
            byte[] buf = out.toByteArray();
            for(int i = 0; i < buf.length; i++) {
                System.out.println(buf[i]);
            }

        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            out.close();
            in.close();
        }

    }
}
