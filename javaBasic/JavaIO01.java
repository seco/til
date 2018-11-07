package self.javaWebProgrammingSchool.basic;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaIO01 {
    public static void main(String[] args) throws Exception {
        // InputStream, OutputStream은 추상클래스
        InputStream in = null;
        OutputStream out = null;

        try {
            // byte[]로 읽어들여서 파일에 저장하고 싶다.
            byte[] buffer = new byte[]{'1','2','3'};
            in = new ByteArrayInputStream(buffer);
            out = new FileOutputStream("bytearray.dat");

            int readBuffer = -1;
            while((readBuffer = in.read()) != -1) {
                out.write(readBuffer);
            }
        }catch (Exception ex) {
            ex.printStackTrace();;
        } finally {
            out.close();
            in.close();
        }
    }
}
