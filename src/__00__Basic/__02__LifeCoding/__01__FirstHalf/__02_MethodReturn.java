package __00__Basic.__02__LifeCoding.__01__FirstHalf;

public class __02_MethodReturn {
    public static String numbering(int init, int limit) {  //  String이라는 것은 return 하는 값의 DataType이 문자열이라는 것을 정의
        int i = init;
        //  만들어지는 숫자들을 output 이라는 변수에 담기 위해서 변수에 빈 값을 정의
        String ouput = "";
        while (i < limit) {
            //  숫자를 화면에 출력하는 대신 변수 output 에 담았다.
            ouput += i;
            i++;
        }
        //  중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return
        //  배치하면 된다.
        return ouput;
    }

    public static void main(String[] args) {  //  void = 공허함, 빈, 비어있는, 따라서 main의 값의 리턴값이 없다는 것을 의미함
        //  메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering(2, 10);
        //  변수 result의 값을 화면에 출력한다.
        System.out.println(result);
    }
}