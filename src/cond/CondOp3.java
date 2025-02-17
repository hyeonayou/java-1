package cond;

import java.util.Scanner;

public class CondOp3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true)
        {
            System.out.println("더하고 싶은 정수를 입력하시오. (0을 입력하면 프로그램 종료) : ");
            int number = scanner.nextInt();

            if(number == 0 )
            {
                break;
            }

            sum += number;

            System.out.println("입력한 모든 수의 합은 ? : " + sum);

        }
    }
}
