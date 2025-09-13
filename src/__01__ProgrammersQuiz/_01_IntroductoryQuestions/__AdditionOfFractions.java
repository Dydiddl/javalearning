package __01__ProgrammersQuiz._01_IntroductoryQuestions;

public class __AdditionOfFractions {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2){
        int[] answer = new int[2];
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int commonMultiple = 1;

        for (int i = 1; i <= numer && i <= denom; i++) {
            if (numer % i == 0 && denom % i == 0) {
                commonMultiple = i;
            }
        }

        numer = numer / commonMultiple;
        denom = denom / commonMultiple;
        answer = new int[]{numer, denom};
        return answer;
    }
    public static void main(String[] args) {
        int[] answer = solution(9, 2, 1, 3);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
