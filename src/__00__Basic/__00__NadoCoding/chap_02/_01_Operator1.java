package __00__Basic.__00__NadoCoding.chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2); // 2.5, 컴퓨터에서 정수나누기를 하고 나면 결과가 정수값으로 나오기 때문에 2만 출력됨
        System.out.println(2 / 4); // 결국 정수 나누기를 하면 몫을 구할 수 있음
        System.out.println(4 % 2); //  4를 2로 나누었을 때의 나머지 값
        System.out.println(5 % 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 더하기 빼기 보다 곱하기 나누기가 우선 순위가 높다, 그래서 먼저 계산됨
        System.out.println((2 + 2) * 2);
        System.out.println(2 + (2 * 2));

        //  변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        c = a * b;
        System.out.println(c);
        c = a / b;
        System.out.println(c);
        c = a % b;
        System.out.println(c);

        //  증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val); // 'var 에 1을 먼저 더하고 sout 을 실행해줘' 라는 의미
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val++);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(--val);
        System.out.println(val);

        val = 10;
        System.out.println(val);
        System.out.println(val--);
        System.out.println(val);

        //  은행 대기번호 표
        int waiting = 0;
        System.out.println("대기인원 : " + waiting++);  //  대기인원 0, 변수++ 는 일단 현상환 그대로 코드를 진행하고, 그다음 +1 을 하는 것이다.
        System.out.println("대기인원 : " + waiting++);  //  대기인원 1  따라서 ++변수 를 활용하면 +1을 한 후 현재 코드를 실행 한다는 의미이다.
        System.out.println("대기인원 : " + waiting++);  //  대기인원 2
        System.out.println("총 대기인원 : " + waiting);  //  대기인원 2


    }
}
