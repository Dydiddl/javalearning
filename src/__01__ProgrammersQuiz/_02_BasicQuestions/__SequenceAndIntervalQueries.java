package __01__ProgrammersQuiz._02_BasicQuestions;

import java.util.Arrays;

public class __SequenceAndIntervalQueries {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        return answer;
    }

    //  [s, e, k] 에대한 s <= i <= e 인 모든 i 구하기
    public static int[] queriesDecomposition(int[][] queries, int i) {
        int[] decompositionResult = new int[queries.length];
        for (int j = 0; j < 3; j++) {
            decompositionResult[j] = queries[i][j];
        }
        System.out.println(Arrays.toString(decompositionResult));
        return decompositionResult;
    }
    public static int[] conditionComparison(int[] arr) {

    }
    public static int[] findArrCondition(int[] arr, int[][] queries) {
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(queriesDecomposition(queries, 0)));
    }
}
