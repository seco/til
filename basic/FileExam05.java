package self.javaWebProgrammingSchool.basic;

import java.io.File;
import java.util.Objects;

public class FileExam05 {
    public static void main(String[] args) {
        // 현재 디렉토리 이하의 파일들을 탐색해서 전체 파일 크기의 합을 출력하시오.
        File file = new File("./src");
        File[] files = file.listFiles();
        for (File f : files) {
            if(f.isFile()){
                System.out.println("[FILE]"+f.listFiles());
            }else if(f.isDirectory()) {
                System.out.println("[DIR]"+f.getPath());
            }else{

            }
            System.out.println(f.getAbsolutePath()+ ", " +f.getTotalSpace());
            System.out.println(f.getParentFile());
        }
    }
}
/*        int fileSizeSummation = 0;
        System.out.println(files[1].length());
        if(file.listFiles() == null) {

        } else if(file.isDirectory()){
            for(File f1 : files) {

            }
        }else {
            fileSizeSummation += f.length();
        }

        for (File f : files) {
            if (f.isDirectory()) {

                System.out.println("[DIR]" + f.getAbsolutePath());
            } else {
                fileSizeSummation += f.length();
                System.out.println(f.getAbsolutePath());
            }
        }*/