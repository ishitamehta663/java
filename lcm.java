import java.io.*;

class lcm{
    // main function
    public static void main(String[] args)
    {
        // Numbers
        int a = 15, b = 25;
        int ans = (a > b) ? a : b;

        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;
        }

        // Printing the Result
        System.out.println("LCM of " + a + " and " + b
                           + " : " + ans);
    }
}
