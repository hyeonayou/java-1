package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean a = add(2);
        System.out.println(a);
    }
    
    public static boolean add(int i)
    {
        if(i % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
