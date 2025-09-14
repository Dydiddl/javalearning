package __01__ProgrammersQuiz._01_IntroductoryQuestions;

public class __SharingPizza_02 {
    public static int numOfPizza(int n) {
        boolean solved = false;
        int i = 1;
        while (!solved) {
            if (i * 6 % n == 0) {
                solved = true;
            } else  {
                i++;
            }
        }
        return i;
    }
    public static int solution(int n) {
        return numOfPizza(n);
    }
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
