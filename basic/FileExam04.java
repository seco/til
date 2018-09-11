package self.javaWebProgrammingSchool.basic;

import java.io.File;

public class FileExam04 {
    public static void main(String[] args) {
        File file = new File("C://java//a//b");
        if(!file.exists()) {
            file.mkdirs();
        }
    }
}
