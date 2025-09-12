package __00__Basic.__00__NadoCoding.chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        //  다차원 배열 (2차원 배열)
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        //  3 x 5 크기의 2차원 배열
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        // B2에 접근하려면?
        System.out.println(seats[1][1]);

        //  첫 줄에는 3칸, 둘째 줄에는 4칸, 셋째 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };
        System.out.println(seats2[0][2]);
//        System.out.println(seats2[0][4]);  // 없는 값에다가 접근하려고 하면 오류가 난다.

        //  3차원 배열 만들기 (가로 x 세로 x 높이 가 있는 3차원 구성의 배열을 만들 수 있음)
//        String[][][] marray = new String[][][] {
//                {{"A1", "A2", "A3", "A4", "A5"},},
//                {{"B1", "B2", "B3", "B4", "B5"},},
//        }
    }
}
