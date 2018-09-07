package self.javaWebProgrammingSchool;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<Integer>();

        list.add(new Integer(11));
        list.add(new Integer(22));
        list.add(new Integer(33));

        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.remove(0);
        System.out.println("");

        for(int i =0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
