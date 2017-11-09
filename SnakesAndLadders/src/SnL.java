import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;

public class SnL {
    public SnL() {
    }

    public static void main(String[] args) {
        int player1 = 1, player2 = 1,player3 = 1,player4 = 1;




        while( player1 <= 35 || player2 <= 35 || player3 <= 35 || player4 <= 35) {
            JOptionPane.showMessageDialog((Component)null, "Your go player one hit the dice to start");
            player1 = dice(player1);
            JOptionPane.showMessageDialog((Component)null, "Your go player two hit the dice to start");
            player2 = dice(player2);
            JOptionPane.showMessageDialog((Component)null, "Your go player three hit the dice to start");
            player3 = dice(player3);
            JOptionPane.showMessageDialog((Component)null, "Your go player four hit the dice to start");
            player4 = dice(player4);
        }

    }

    public static int dice(int x) {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        x += dice;
        JOptionPane.showMessageDialog((Component)null, "You got " + dice + " your new score is " + x);
        if (x == 5) {
            x = 20;
            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + x);
        }

        if (x == 11) {
            x = 3;
            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + x);
        }

        if (x == 10) {
            x = 23;
            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + x);
        }

        if (x == 25) {
            x = 12;
            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + x);
        }

        if (x == 17) {
            x = 26;
            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + x);
        }

        if (x == 27) {
            x = 14;
            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + x);
        }

        if (x == 11) {
            x = 3;
            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + x);
        }

        System.out.println(x + "\n");
        return x;
    }
}
