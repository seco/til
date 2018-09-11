package self.javaWebProgrammingSchool.basic;

public class CalBean {
    public static void main(String[] args) {
        int i = 6;
        int k =0;
        int value =Cal.divide(i, k);
        // value를 다른 중요한 계산식과 함께 사용하였다면!?
        System.out.println(value);
    }


    static class Cal {
        /**
         *  파라미터 m을 n으로 나눈 결과를 리턴한다.
         * @param m
         * @param n
         * @return m을 n으로 나눈 결과
         * @throws IllegalArgumentException n이 0일 경우 발생한다.
         */
        public static int divide(int m, int n) throws IllegalArgumentException {
            if(n == 0) {
                throw new IllegalArgumentException("0으로 나눌수 없다.");
            }

            int value = 0;
            value = m /n;
            return value;
        }
    }
}

class ParameterException extends RuntimeException {
    public ParameterException(String msg) {
        super(msg);
    }
}