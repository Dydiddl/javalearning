package __00__Basic.chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // 문자열 변수 선언 , "dydiddl"라는 문자열을 넣는 것을 초기화라고 한다.(초기화 -> 초기값 설정)
        String name = "dydiddl";
        int hour = 15;
        System.out.println(name + "님 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5; // 상대적으로 정밀한 숫자를 표현하는 것 double
        char grade = 'A';
        name = "홍길동";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? : " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; // 또는 3.14f로 표현해야 한다.
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // 21억을 초과하는 큰 숫자는 long을 사용하는데, 끝에 l, L을 적어줘야 한다.
        l = 1_000_000_000_000L; // 사람이 알아보기 쉽게 숫자에 3자리마다 _를 사용해서 구분해서 사용할 수 있음
        System.out.println(l);

        // int, long, float, double, char, String, boolean <- 자료형의 종류들,
        // 더 많은 것이 있지만, 그것은 나올때마다 공부하는 방향으로 진행
    }
}
