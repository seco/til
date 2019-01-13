package DFS;

import java.util.Random;

public class DfsEx01 {
    public static void main(String[] args) {
        System.out.println("hello world!");

        DfsEx01.solution(4);

    }

    public static void solution(int numOfAirport) {
        String rootAirport = "ICN";
        String airports = null;
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        String[] arr = new String[numOfAirport];
        String airport=null;



        if (numOfAirport > 3 && numOfAirport < 10000) {
            int k = 0;
            while (k < 3*numOfAirport) {
                    String randomStr = String.valueOf((char) ((int) (random.nextInt(26)) + 65));
                    airports = sb.append(randomStr).toString();
                k++;
            }

            for(k=0; k<numOfAirport; k++) {
                if(k % 3 == 0) {
                    while(k!=0) {
                        airport = airports.substring(k);
                    }
                    System.out.println("airport length : "+airport.length());
                }
            }

        }else {
            System.out.println("wrong info");
        }
        System.out.println(airports);
        System.out.println(airports.length());
        System.out.println(airport);

    }
}