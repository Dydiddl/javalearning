package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        //  Quiz 3
        //  주민등록번호에서 생년월일 및 성별 까지만 출력하는 프로그램을 작성하시오.
        //  참고
        //  - 주민등록번호는 13자리의 숫자로 구성
        //  - 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        //  - 입력 데이터는 -을 포함한 14자리의 문자열 형태
        //  출력 예시
        //  "901231-1234567" 인경우 901231-1 까지 출력

        String residentRegistrationNumber = "900430-1111879";
        System.out.println(residentRegistrationNumber.substring(
                0, 8
                )
        );
        System.out.println(
                residentRegistrationNumber.substring(
                        0, residentRegistrationNumber.indexOf("-") + 2
                )
        );
    }
}
