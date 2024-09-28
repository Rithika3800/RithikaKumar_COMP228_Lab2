package excersice2;
import javax.swing.*;

public class Main
{
    public static void main(String[] args) {
        int userinput = 0;
        String input;
        while (true)
        {
           input = JOptionPane.showInputDialog("Enter numbers between 3 and 27-");
            if (input == null)
            {
                JOptionPane.showMessageDialog(null, "The game is canceled.");
                return;
            }
            try {
                userinput = Integer.parseInt(input);
                if (userinput>= 3 && userinput<= 27)
                {
                    break;
                } else
                {
                    JOptionPane.showMessageDialog(null, "Please enter a number between the range 3 to 27");
                }
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number");
            }
        }
        int total;
        int go;
        for (go = 1; go <= 5; go++)
        {
            Lotto lottogame = new Lotto();
             total = lottogame.getSum();
            JOptionPane.showMessageDialog(null, "Try " + go + "\nSum of the Lotto Numbers: " + total);
            if (total == userinput)
            {
                JOptionPane.showMessageDialog(null, "You are the winner!");
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Sorry! You've have lost. The computer wins!");
    }
}

