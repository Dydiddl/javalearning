package __00__Basic.__00__NadoCoding.chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 퀴즈2
        // 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.
        // 키가 120cm 이상인 경우에만 탑승 가능
        // 삼항 연산자 이용
        // 실행 결과
        // 키가 115cm 이므로 탑승 불가능합니다.
        // 키가 121cm 이므로 탑승 가능합니다.

        int tall1 = 115;
        int tall2 = 121;
        String q1 = tall1 >= 120 ?
                "키가 " + tall1 + "cm이므로 탑승 가능합니다."
                : "키가 " + tall1 + "cm이므로 탑승 불가능합니다.";
        System.out.println(q1);
        String q2 = tall2 >= 120 ?
                "키가 " + tall2 + "cm이므로 탑승 가능합니다."
                : "키가 " + tall2 + "cm이므로 탑승 불가능합니다.";
        System.out.println(q2);


    }
}
