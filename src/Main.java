import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter e:");
        double e = Double.parseDouble(reader.readLine());

        int n = 0;
        double an;
        while (true)
        {
            n = n+1;
            an = 1 / Math.pow((n + 1), 2);
            System.out.println("Ai"+n+" = "+an);
            if (an < e)
            {
                System.out.println("При n=" + n + " выполняется условиве (An<e), An=" + an);
                break;
            }
        }
    }
}


