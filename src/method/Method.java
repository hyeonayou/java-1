package method;

public class Method {
    public static void main(String[] args) {

        test1();
    }

    // 반환 타입이 void 인 경우에는  retrun; 생량 가능.
    // 자바 컴파일러가 반환 타입이 없는 경우에 return을 넣어줌
    public static void test1()
    {
        System.out.println("안녕하세요. ");
    }
}
