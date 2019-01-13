package bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01 {
    public static void main(String args[]) {

        //input
        int testCase = 3;
        int n = 6;
        int m = 0;

        List<Integer> importance = new ArrayList<>();
        importance.add(1);
        importance.add(1);
        importance.add(9);
        importance.add(1);
        importance.add(1);
        importance.add(1);

        System.out.println(importance);

        System.out.println("m : "+importance.get(0));
        //output
        int largeNum = Collections.max(importance);
        System.out.println("largeNum "+largeNum);

//        for(int i=0; i<testCase; i++) {

            for(int j=0; j<importance.size(); j++) {

                if(importance.indexOf(j) < importance.indexOf(largeNum)) {
                       importance.add(importance.get(j)); // add at the
                        importance.remove(j);
                    System.out.println(importance);
                }
            }//importance
//        }//test case

        System.out.println(importance.get(m));
    }


}
