package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        int money = 0;

        Scanner scanner = new Scanner(System.in);

        for( ; ; )
        {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int num = scanner.nextInt();

            if(num == 1)
            {
                System.out.print("입금액을 입력하세요. :");
                int sum = scanner.nextInt();
                money = deposit(money, sum);
                System.out.println(sum +"원을 입금하였습니다. 현재 잔액: " + money);
            }
            else if(num == 2)
            {
                System.out.print("출금액을 입력하세요. :");
                int sub = scanner.nextInt();

                money = withdraw(money, sub);
            }
            else if(num == 3)
            {
                System.out.println("현재 잔액: " + money);
            }
            else if(num == 4)
            {
                System.out.println("시스템을 종료합니다.");
                return;
            }
            else
            {
                System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
            }

        }

    }

    public static int deposit(int money, int sum)
    {
        money += sum;
        return money;
    }

    public static int withdraw(int money, int sub)
    {
        if(money >= sub)
        {
            money -= sub;
            System.out.println(sub +"원을 출금하였습니다. 현재 잔액: " + money);
        }
        else
        {
            System.out.println(sub +"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return money;
    }
}
