package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //  반복문 Do While
        int distance = 25;
        int move = 0;
        int height = 2;

        while (move + height < distance) {
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");
        System.out.println("---반복문 #1---");
        move = 0;
        height = 25;
        while (move + height < distance) {
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println("---반복문 #2---");

        //  Do While
        do {
            System.out.println("현재 이동거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
