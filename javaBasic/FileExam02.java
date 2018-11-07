package self.javaWebProgrammingSchool.basic;

import java.io.File;

public class FileExam02 {
    public static void main(String[] args) {
        File file = new File("."); // .은 현재 경로를 말한다.
        // 절대경로를 출력한다.
        // 절대경로는 / 로 시작하거나 드라이브명으로 시작한다.
        // 자바 버추얼 머신은 해당 프로젝트 밑에서 실행된다.
        System.out.println(file.getAbsolutePath());
    }
}
