package array;

public class EnhancedFor1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }



        //향상된 for문 , for-each문
        for(int num : numbers)
        {
            System.out.println(num);
        }
    }
}
