package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child - > Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent - > Child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); 자식의 기능은 호출할 수 없다.

        //Child child1 = new Parent(); 자식은 부모를 담을 수 없다.
    }
}
