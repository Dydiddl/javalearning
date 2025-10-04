package __01__ProgrammersQuiz._02_BasicQuestions;

import java.util.Arrays;

public class __SequenceAndIntervalQueries {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int result[] = new int[queries.length];  //  출력값
        int rangeInitialValue = 0;  //  결과값 범위 초기값
        int rangeLastValue = 0;  //  결과값 범위 최종값
        int comparisonNumber = 0;  //  비교하는 번호

        for (int i = 0; i < queries.length; i++) {
            rangeInitialValue = queries[i][0];  //  범위의 초기값 설정
            rangeLastValue = queries[i][1];  //  범위의 최종값 설정
            comparisonNumber = queries[i][2];  //  비교하는 번호

            int minValue = Integer.MAX_VALUE;

            for (int j = rangeInitialValue; j <= rangeLastValue; j++) {
                if (arr[j] > comparisonNumber && arr[j] < minValue) {
                    minValue = arr[j];
                    }
                }
            result[i] = (minValue == Integer.MAX_VALUE) ? -1 : minValue;
            }
        return result;
    }
}
