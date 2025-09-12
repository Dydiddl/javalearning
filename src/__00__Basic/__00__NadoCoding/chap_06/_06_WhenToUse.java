package __00__Basic.__00__NadoCoding.chap_06;

public class _06_WhenToUse {

    public static int getPower(int number) {
//        int result = number * number;
//        return result;
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //  method 필요 이유

        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        //  중복되는 코드들을 줄이고
        //  프로그램의 유지보수 측면에서 이득이 있으며,
        //  그래서 Method를 최대한 활용해서 코드를 작성해야 한다.

    }
}
