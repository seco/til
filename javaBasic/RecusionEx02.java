package self.javaWebProgrammingSchool.basic;

public class RecusionEx02 {
    public static void main(String[] args) {
        factorial(5);
    }

    public static int factorial(int n){
        if(n==0) return 1;
        else return n*factorial(n-1);
    }
}
