package __00__Basic.__00__NadoCoding.chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }
    public static int getPowerExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //  전달값과 반환값이 같이 있는 Method
        int retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPower(4);
        System.out.println(retVal);

        retVal = getPowerExp(3, 3);
        System.out.println(retVal);
        System.out.println(getPowerExp(2, 4));
    }
}
