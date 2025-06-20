package poly.basic;

// 다운캐스팅
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); // 인스턴스가 Parent 타입으로 생성되어 메모리 상에 자식 타입이 존재하지 않음
        Child child2 = (Child) parent2; // 런타임 오류
        child2.childMethod(); // 실행 불가
    }
}
