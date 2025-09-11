package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {


        //  퀴즈4
        //  조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오.

        //  조건
        //  주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        //  경차 또는 장애인 차량은 최종 요금에서 50% 할인

        //  주차요금 예시
        //  일반차량 5시간 주차 시 20000원
        //  경차 5시간 주차 시 10000원
        //  장애인 차량 10시간 주차시 15000원

        //  실행결과
        //  일반차량 5시간 주차시 20000원
        //  "주차 요금은 20000 원입니다.
        //  경차 5시간 주차 시 10000원
        //  "주차 요금은 10000 원입니다."
        //  장애인 차량 10시간 주차 시 15000원
        //  "주차 요금은 15000 원입니다."


//나의 풀이
//        String carType = "장애인 차량";
//        int parkTime = 10;
//        double parkingFees = 0;
//        switch (carType) {
//            case "일반차량":
//                if (parkTime * 4000 <= 30000) {
//                    parkingFees = parkTime * 4000;
//                    System.out.println("주차 요금은 " + parkingFees + " 원입니다.");
//                } else {
//                    parkingFees = 30000;
//                    System.out.println("주차 요금은 " + parkingFees + " 원입니다.");
//                }
//                break;
//            case "장애인 차량":
//            case "경차":
//                if (parkTime * 4000 <= 30000) {
//                    parkingFees = (parkTime * 4000) * 0.5;
//                    System.out.println("주차 요금은 " + parkingFees + " 원입니다.");
//                } else {
//                    parkingFees = 30000 * 0.5;
//                    System.out.println("주차 요금은 " + parkingFees + " 원입니다.");
//                }
//                break;

        //  해설을 보고 난 후 풀이
        int hour = 10;
        boolean isSmallCar = false;
        boolean withDisabledPerson = true;
        int fee = hour * 4000;
        if (fee >= 30000){
            fee = 30000;
        }
        if (isSmallCar || withDisabledPerson) {
            fee /=2;
        }
        System.out.println("주차 요금은 " + fee + " 원입니다.");


    }
}
