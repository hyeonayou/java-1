package static1.ex;

public class MathArrayUtils {

   // private static int[] num;
    private MathArrayUtils() {

    }

    public static int sum(int[] num) {
        int sum = 0;
        for(int n : num) {
            sum =+n;
        }
        return sum;
    }

    public static double average(int[] num) {
        return (double) sum(num) / num.length;
    }

    public static int min(int[] num) {
        int minNum = num[0];
        for(int s: num) {
            if(s < minNum) {
                 minNum = s;
            }
        }
        return minNum;
    }
}
