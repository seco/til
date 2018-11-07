package self.javaWebProgrammingSchool.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaIO03 {
    public static void main(String[] args) throws Exception {
        InputStream in = null;
        OutputStream out = null;

        try{
            in = new FileInputStream("./src/JavaIO03.java");
            out =new  FileOutputStream("file.txt");

            int readCount = 0; // 읽어들인 수
            byte[] buffer = new byte[1024];

            while((readCount = in.read(buffer)) !=-1){
                out.write(buffer, 0, readCount);
            }
        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
            in.close();
            out.close();
        }
    }
}
