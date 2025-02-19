package array;

public class Array2 {
    public static void main(String[] args) {
        //2차원 배열
        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };

        for(int row = 0; row< arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
