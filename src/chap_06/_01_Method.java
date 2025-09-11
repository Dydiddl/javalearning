package chap_06;

public class _01_Method {
    // Method 정의
    public static void sayHello() {
        System.out.println("hello! This is Method!!");
    }


    public static void main(String[] args) {
        //  Method(Python의 함수와 비슷함) 호출
        System.out.println("Method 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("Method 호출 후");
    }
}
