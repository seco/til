package self.javaWebProgrammingSchool;

import java.util.ArrayList;
import java.util.List;

public abstract class CardFactory {
    public static List<Card> create() {
        List<Card> list = new ArrayList<>();

        String[] types = new String[]{"스페이드", "하트", "다이아", "클로버"};
        for(String type : types) {
            for(int i =0; i< 13; i++) {
                Card card = new Card(type, i);
                list.add(card);
            } //for
        } // for types
        return list;
    } // create()
}
