package self.javaWebProgrammingSchool.basic;

import java.io.File;
import java.time.Year;
import java.util.Calendar;

public class FileExam06 {
    public static void main(String[] args) {
        File file = new File("C://java//tmp");
        if(!file.exists()) file.mkdirs();
        Calendar cal1 = Calendar.getInstance();
        System.out.println(cal1.get(Calendar.YEAR)+""+cal1.get(Calendar.MONTH)+""+cal1.get(Calendar.DAY_OF_WEEK));
    }
}
