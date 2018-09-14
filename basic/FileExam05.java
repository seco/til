package self.javaWebProgrammingSchool.basic;

import java.io.File;

// 현재 디렉토리 이하의 파일들을 탐색해서 전체 파일 크기의 합을 출력하시오.
public class FileExam05 {
    public static void main(String[] args) {
        File file = new File(".");
        File[] files = file.listFiles();
        for(File f : files) {
            System.out.println(f.getPath()+ " " + f.length());
            subDir(".");
        }
    }

    public static void subDir(String path) {
        File file = new File(".");
        File[] files = file.listFiles();

        if(file.isDirectory()) {
            path = file.getAbsolutePath()+file.getPath();
            System.out.println(path);
        }
    }
}
