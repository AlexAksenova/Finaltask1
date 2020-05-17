import java.util.Scanner;

public class binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число ");
        String str = sc.nextLine();
        int sum = 0, a;
        int c;
        for (int i = 0; i < str.length(); i++)
        {
            c = str.charAt(str.length() - 1 - i);

            if (c == '1' || c == '0')
            {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else
                {
                System.out.println("Неверный ввод!");
                return;
            }
            int res=1;
            for (int j=0; j<i; j++)
            {
                res=res*2;
            }
            sum += (a * res);
        }

        System.out.println("" + str + "->" + sum);
    }
}