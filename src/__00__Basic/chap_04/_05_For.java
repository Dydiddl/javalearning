package __00__Basic.chap_04;

public class _05_For {
    public static void main(String[] args) {
        //  반복문 For(선언; 조건; 증감)
        for (int j = 1; j < 11; j++) {
            System.out.println("안녕하세요!" + j + "번째 손님을 환영합니다.");
        }
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i);
        }

        System.out.println();
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        System.out.println();
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.println("현재까지 총합 " + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
    }
}
