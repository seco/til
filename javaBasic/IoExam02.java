package self.javaWebProgrammingSchool.basic;

import java.io.*;

public class IoExam02 {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try {
            File file = new File("C://java//test.txt");
            if(!file.isDirectory() && file.exists()){
                in = new FileInputStream(file);
                out = new FileOutputStream("C://java//testOut.txt");
                // 덮어쓰기 방지할때도 생각해보기
                byte[] buffer = new byte[1024];
                int readCount = 0;
                while((readCount = in.read(buffer)) != -1) {
                    out.write(buffer, 0, readCount);
                }
            }

        }catch(Exception ex){
            ex.printStackTrace();;
        }finally{
            try {
                in.close();
            }catch(IOException ex) {}
            try {
                out.close();
            } catch(IOException ex) {}
        }
    }
}
