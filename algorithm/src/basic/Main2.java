package basic;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a < b && b < c) {
            System.out.println(b);
        }else if(b < c && c < a){
            System.out.println(c);
        }else if(c < a && a < b){
            System.out.println(a);
        }

        
    }
}
