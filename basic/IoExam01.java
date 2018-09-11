package self.javaWebProgrammingSchool.basic;

import java.io.*;

public class IoExam01 {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;

        try {
            File file = new File("C://java//test.txt");
            if(!file.isDirectory() && file.exists()){
                in = new FileInputStream(file);
                out = new FileOutputStream("C://java//testOut.txt");
                int readData = -1;
                while((readData = in.read()) != -1) {
                    out.write(readData);
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
