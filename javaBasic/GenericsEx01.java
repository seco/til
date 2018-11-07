package self.javaWebProgrammingSchool.basic;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (int i =0 ; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
