package poly.basic;

// 일시적 다운캐스팅
public class CastingMain2 {

    public static void main(String[] args) {
        Parent poly = new Child();

        //일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child)poly).childMethod();
    }
}
