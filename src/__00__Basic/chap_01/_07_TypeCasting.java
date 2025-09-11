package __00__Basic.chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        //  float, double to int
        float scoreF = 93.3F;
        double scoreD = 98.8;
        System.out.println((int) scoreF); // 93
        System.out.println((int) scoreD); // 98

        // 정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score);

        scoreD = (double) 93 + 98.8; // 93.0 + 98.8
        System.out.println(scoreD);
        scoreD = 93 + 98.8; // 93.0 + 98.8
        System.out.println(scoreD);

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        //  int > long > float > double (자동 형변환)

        int convertedScoreInt = (int) scoreD; // 191.8 -> 191 (큰범위의 데이터를 작은 데이터로 넣으려고 하니 좁아서 오류가남)
        // double -> float -> long -> int (수동으로 형 변환을 해줘야함)

        // 숫자를 문자열로
        String s1 = String.valueOf(93) ;
        s1 = Integer.toString(93);
        System.out.println(s1); //  93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93"); //  파싱
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);

//        int error = Integer.parseInt("Java"); // 들어있는 데이터가 올바른 타입이 아니라서 오류 발생
    }
}
