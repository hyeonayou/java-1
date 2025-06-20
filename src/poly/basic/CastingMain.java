package poly.basic;

public class CastingMain {
    public static void main(String[] args) {
        Parent poly = new Child();
        //poly.childMethod(); 자식의 기능 호출 불가
        // 다운캐스팅
        Child child = (Child) poly;
        child.childMethod();
    }
}
