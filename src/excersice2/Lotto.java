package excersice2;
import java.security.SecureRandom;
public class Lotto
{
    private int[] num;
    private SecureRandom randomnumber;

    public Lotto()
    {
        num = new int[3];
        randomnumber = new SecureRandom();
        stimulateNumbers();
    }

    private void stimulateNumbers()
    {
        for (int r = 0; r < num.length; r++)
        {
            num[r] = 1 + randomnumber.nextInt(9);
        }
    }

    public int[] getNumbers()
    {
        return num;
    }

    public int getSum() {
        int total = 0;
        for (int number : num)
        {
            total += number;
        }
        return total;
    }
}
