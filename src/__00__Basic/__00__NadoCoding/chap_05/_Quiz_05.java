package __00__Basic.__00__NadoCoding.chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 퀴즈5
        //  배열을 활용하여 쇼핑몰에서 구매 가능한 실발 사이즈 옵션을 출력하는 프로그램을 작성하시오.
        // 조건
        //  신발 사이즈는 250부터 295 까지 5단위로 증가
        //  신발 사이즈 수는 총 10가지

        int[] footSizeArray = new int[10];
        for (int i = 0; i < footSizeArray.length; i++) {
            footSizeArray[i] = 250 + (5 * i);
        }

        for (int size : footSizeArray) {
            System.out.println("사이즈 " + size + "(재고있음)");
        }
    }
}
