package method;

public class MethodReturn2 {
    public static void main(String[] args) {

        int num1 = 5;
        num1 = add(num1);

        System.out.println(num1);
    }

    public static int add(int num2)
    {
        num2 = num2 * 2;
        return num2;
    }
}
