package __00__Basic.__02__LifeCoding.__01__FirstHalf;

public class __01__MethodFormat {
    public static void numbering() {  //  <- numbering method define (메소드 정의)
        //  int limit <--  Parameter(매개변수)
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
    public static void numbering(int limit) {  //  <- numbering method define (메소드 정의)
        //  int limit <--  Parameter(매개변수)
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
    public static void numbering(int init, int limit) {  //  <- numbering method define (메소드 정의)
        //  int limit <--  Parameter(매개변수)
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {  //  <- 항상 사용하고 있었던 거이 매소드이다.
        //  5  <-  Argument(인자)
        numbering(5);  //  <- Method call (메소드 호출)
        System.out.println("-----구분자-----");
        numbering(3, 5);
        System.out.println("-----구분자-----");
        numbering();
        System.out.println("-----구분자-----");
    }
}
