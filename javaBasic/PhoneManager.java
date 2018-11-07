package self.javaWebProgrammingSchool.basic;

import java.util.Scanner;

public class PhoneManager {
    final int MAX_CNT = 100;
    PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
    int curCnt = 0;

    public void InputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("데이터 입력을 시작합니다.");
        System.out.print("이름");
        String name = sc.nextLine();
        System.out.print("전화번호");
        String phoneNumber = sc.nextLine();
        System.out.print("생년월일");
        String birthday = sc.nextLine();

        infoStorage[curCnt++]  = new PhoneInfo(name, phoneNumber, birthday);
        System.out.println("입력이 완료되었습니다.");
    }

    public void SearchData() {
        System.out.println("데이터를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int dataIdx = search(name);

        if(dataIdx < 0 ) {
            System.out.println("데이터가 존재하지 않습니다.");
        } else {
             infoStorage[dataIdx].showPhoneInfo();
            System.out.println("데이터 검색이 완료되었습니다.");
        }

    }

    private  int search(String name) {
        for(int idx = 0; idx < curCnt ; idx++) {
            PhoneInfo curInfo = infoStorage[idx];
            if(name.compareTo(curInfo.getName())==0)
                return idx;
        }
        return -1;
    }


    public void deleteData() {

    }
}
