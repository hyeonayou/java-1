package poly.ex5;

public class InterfaceMain1 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
