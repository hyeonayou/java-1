package cond;

public class Casting2 {
    public static void main(String[] args) {

        double doubleValue = 1.5;
        int intValue = 0;

        // 큰 범위에서 작은 범위 대입은 명시적 형변환 필요
        intValue = (int) doubleValue; // 형변환
        System.out.println(intValue); // 1
    }
}
