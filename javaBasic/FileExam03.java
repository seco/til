package self.javaWebProgrammingSchool.basic;

import java.io.File;

public class FileExam03 {
    public static void main(String[] args) {
        File file = new File(".");
        File[] files = file.listFiles();

        for(File f : files) {
            if(f.isDirectory()){
                System.out.println("[DIR]"+f.getAbsolutePath());
            }else{
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}
