package __00__Basic.__00__NadoCoding.chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 퀴즈1
        // 버스 도착 정보를 출력하는 포르고램을 작성
        // 각 정보는 적절한 자료형의 변수에 정의
        // 정보
        // 버스 번호는 "1234", "상암08" 과 같은 형태
        // 남은 시간은 분 단위 (예 : 3분, 5분)
        // 남은 거리는 Km 단위 (예 : 1.5km, 0.8km)

        // 예 : 실행 결과
        // 상암08번 버스
        // 약 3분 후 도착
        // 남은 거리 1.2km
        String busNum = "상암08";
        int minute = 3;
        float distanceRemain = 1.2F;
        // 출력
        System.out.println(busNum + "번 버스");
        System.out.println("약 " + minute + "후 도착");
        System.out.println("남은 거리 " + distanceRemain + "Km");
    }
}
