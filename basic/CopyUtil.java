package self.javaWebProgrammingSchool.basic;

import java.io.*;

public class CopyUtil {
    public static void copy(InputStream in, OutputStream out) {
        try{
            byte[] buffer = new byte[1024];
            int readCount = 0;
            while((readCount = in.read(buffer))!= -1) {
                out.write(buffer, 0, readCount);
            }

        }catch(Exception ex) {
            ex.printStackTrace();
        }finally {
          try{
              in.close();
          }catch (Exception ex) {}
          try{
              out.close();
          }catch (Exception ex) {}
        }
    }
}
