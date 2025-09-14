package __01__ProgrammersQuiz._01_IntroductoryQuestions;

import java.util.Arrays;

public class __DontLikeEven {
    public static int arrayLength(int n) {
        return (n + 1) / 2;
    }
    public static int[] findingOddNum(int n) {
        System.out.println(arrayLength(n));
        int[] oddNum = new int[arrayLength(n)];
        int oddNumIndex = 0;
        for (int i = 1; i <= n; i += 2) {
                oddNum[oddNumIndex] = i;
                oddNumIndex++;
        }
        return oddNum;
    }

    public static int[] solution(int n) {
        //  1 <= n <= 100
        return findingOddNum(n);
    }

    public static void main(String[] args) {
        int n = 100;
        System.out.println(Arrays.toString(solution(n)));
    }

}

/*
n = 1 -> {1} n * (n / 2) + 1
n = 2 -> {1} (n / 2)
n = 3 -> {1, 3}
n = 4 -> {1, 3}
n = 5 -> {1, 3, 5}
n = 6 -> {1, 3, 5}
n = 7 -> {1, 3, 5, 7}
n = 8 -> {1, 3, 5, 7}
n = 9 -> {1, 3, 5, 7, 9}
n = 10 -> {1, 3, 5, 7, 9}
n = 11 -> {1, 3, 5, 7, 9, 11}
n = 12 -> {1, 3, 5, 7, 9, 11}
n = 13 -> {1, 3, 5, 7, 9, 11, 13}

 */