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
        int rangeInitialValue = 0;
        int rangeLastValue = 0;
        Arrays.sort(arr);
        for (int i = 0; i < queries.length; i++) {
            rangeInitialValue = queries[i][0];
            rangeLastValue = queries[i][1];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= rangeInitialValue && arr[j] <= rangeLastValue) {
                    if (arr[j] > queries[i][3]) {
                        result[i] = arr[j];

                    }
                }
            }
        }
        return result;
    }
}
