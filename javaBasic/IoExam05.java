package self.javaWebProgrammingSchool.basic;

import java.io.*;

public class IoExam05 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
        PrintWriter pw = null;

        //키보드로부터 한줄씩 입력받아서 파일에 한줄씩 출력하시오.
        // quit 이라고 입력하면 프로그램은 종료됩니다.
        // 1. 어디에서 읽어들일 것인가? 키보드(System.in : 표준 입력)
        // 2. 어디에 쓰는 것인가? 파일 (FileWriter : 파일에 char 단위 출력)
        // 3. 읽는 방법 : 한줄씩 입력받는다. // bufferedReader
        // 4. 쓰는 방법 : 한줄씩 쓴다. // PrintWriter
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            pw = new PrintWriter(new FileWriter("C://java//test.txt"));


        }catch (Exception ex) {
            ex.printStackTrace();;
        }finally {
            try {
                br.close();
            }catch(IOException ex) {}

            pw.close();
        }
    }
}
