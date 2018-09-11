package self.javaWebProgrammingSchool.basic;

import java.io.File;

public class FileExam01 {
    public static void main(String[] args) {
        String fileName = File.separator + "C:" + File.separator + "java" + File.separator + "test.txt";
        File file = new File(fileName);

        if(file.exists()) {
            System.out.println(fileName + "이 있어요");
        }
    }
}
