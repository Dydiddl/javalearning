package __00__Basic.__00__NadoCoding.chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        //  대입연산자
        int num = 10;
        num = num + 2;
        System.out.println(num);
        num = num - 2;
        System.out.println(num);
        num = num * 2;
        System.out.println(num);
        num = num / 2;
        System.out.println(num);
//        num = num % 2;
//        System.out.println(num);

        //  복합 대입 연산자
        num = 10;
        // sum = num + 2; // 아래 코드와 동일한 동작을 함
        num += 2;
        System.out.println(num);
        num -= 2;
        System.out.println(num);
        num *= 2;
        System.out.println(num);
        num /= 2;
        System.out.println(num);
        num %= 2;
        System.out.println(num);

    }
}
