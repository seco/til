package self.javaWebProgrammingSchool;

import java.util.ArrayList;
import java.util.List;

public class GenericsEx02 {
    public static void main(String[] args) {
    List<String> cities = new ArrayList<>();
    cities.add("seoul");
    cities.add("kyonggi");
    cities.add("kangwon");


        for (String city : cities) {
            System.out.println(city.toUpperCase());
        }
    }
}
