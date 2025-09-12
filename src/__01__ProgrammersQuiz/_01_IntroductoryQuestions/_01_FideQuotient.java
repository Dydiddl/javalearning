package __01__ProgrammersQuiz._01_IntroductoryQuestions;

public class _01_FideQuotient {
    public static int solution(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int answer = solution(num1, num2);
        System.out.println(answer);
    }
}
