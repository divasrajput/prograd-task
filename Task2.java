//minimum number of coins required

import java.util.Scanner;
public class Task2
{

    static int minCoins(int coins[], int n, int amount)
    {
        // `if there are no coins`
        if (amount == 0)
            return 0;

        int res = Integer.MAX_VALUE;
        // Trying every coin that has value less than given V
        for (int i=0; i<n; i++)
        {
            if (coins[i] <= amount)
            {
                int result = minCoins(coins, n, amount-coins[i]);
                if (result != Integer.MAX_VALUE && result + 1 < res)
                    res = result + 1;
            }
        }
        return res;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of denominations ");
        int num = sc.nextInt();
        int coins[] = new int[num];
        //taking values of each denominations
        System.out.println("Enter values of coins ");
        for(int i=0;i<num;i++){
            coins[i] = sc.nextInt();
        }
        // Taking the input of amount 
        System.out.print("Enter target amount ");
        int amt = sc.nextInt();
        System.out.println("Minimum coins required is " );
        //Method calling
        int res = minCoins(coins, num, amt);
        System.out.println(res);

    }
}
