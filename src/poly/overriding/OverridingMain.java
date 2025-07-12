package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println(child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println(parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent parent1 = new Child();

        System.out.println(parent1.value);
        parent1.method(); // 메서드 오버라이딩
    }
}
