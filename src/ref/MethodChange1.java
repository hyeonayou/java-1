package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        int num = changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);
        System.out.println(num);
    }

    static int changePrimitive(int x)
    {
        return  x = 20;
    }
}
