package DFS;

import java.util.*;

public class DfsEx02 {

    public static List<Integer> relList1 = new ArrayList<>();
    public static List<Integer> relList2 = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int userNum = sc.nextInt();
        int relCnt = sc.nextInt();




        for(int i = 0; i<userNum; i++) {
            int rel1 = sc.nextInt();
            int rel2 = sc.nextInt();

            relList1.add(rel1);
            relList2.add(rel2);
        }



        System.out.println(userNum+", "+relCnt);
        dfs(userNum, relCnt);


    }

    public static int dfs(int userNum, int relCnt) {

        int result=0;

        if(userNum < 2 && userNum > 100 && relCnt < 1 && relCnt > 5000) {
            System.out.println("잘못된숫자가들어왔습니다.");
            return 0;
        } else {

            List<Integer> subResult = new ArrayList<>();
            int rel;

            for(int i =0; i<relCnt; i++) {

                if(!relList1.equals(null)) {
                    // 관계.count+1;
                }
            }

            result = Collections.min(subResult);
            return result;
        }

    }
}
