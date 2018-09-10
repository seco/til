package self.javaWebProgrammingSchool.basic;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class JavaIO04 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("keyboard.txt");
            pw = new PrintWriter(fw);
            String line = null;
            int num = 1;
            while((line = br.readLine()) != null) {
                pw.println(num+ " : " + line);
                num++;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        } finally {
            try {
                pw.close();
            }catch(Exception ex) {}
              try{
                  br.close();
              }catch(Exception ex ) {}
        }
    }
}
