package basic;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> list = new ArrayList<>();

        String split[] = s.split(" ");

        for(int i=0; i < split.length; i++){
            System.out.println(split[i]);
            list.add(Integer.parseInt(split[i]));
        }

        System.out.println("===max value===");
        System.out.println(Collections.max(list));

    }
}
