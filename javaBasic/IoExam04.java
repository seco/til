package self.javaWebProgrammingSchool.basic;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class IoExam04 {
    public static void main(String[] args) throws Exception{
        URL url = new  URL("https://www.naver.com");
        InputStream in = url.openStream();

        OutputStream out = new FileOutputStream("C://java//naver.html");
        CopyUtil.copy(in, out);
    }
}
