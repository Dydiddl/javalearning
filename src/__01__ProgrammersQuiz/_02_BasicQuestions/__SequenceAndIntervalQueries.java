package __01__ProgrammersQuiz._02_BasicQuestions;

import java.util.Arrays;

public class __SequenceAndIntervalQueries {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
    public static int[] solution(int[] arr, int[][] queries) {
        int result[] = {};
        int comparisonArray[] = {};
        int rangeInitialValue = 0;
        int rangeLastValue = 0;
        int comparisonNumber = 0;

        for (int i = 0; i < queries.length; i++) {
            rangeInitialValue = queries[i][0];
            rangeLastValue = queries[i][1];
            comparisonNumber = queries[i][3];
            for (int j = rangeInitialValue; j < rangeLastValue; j++) {
                if (arr[j] > comparisonNumber) {
                    comparisonArray += arr[j];
                    }
                }
            }
        }
        return result;
    }
}
