package static1.ex;

public class Car {

    private String carName;
    private static int count;

    public Car(String carName) {
        this.carName = carName;
        count ++;
        System.out.println("차랑 구입, 이름: " + carName);
    }
    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }

}
