import javax.swing.*;


public class playerDriver {
    public static void main(String[] args) {

        JTextArea jta = new JTextArea("users:\n\n");

        String name, colour;




        int amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of players"));
        if (amount > 4 || amount <2) {
            JOptionPane.showMessageDialog(null, "im sorry but at least two and only four players can play", "Stupid", JOptionPane.ERROR_MESSAGE);
        }


        else {

            player[] playerArray= new player[amount];

            for (int x = 0; x < amount; x++) {

                name = JOptionPane.showInputDialog("Enter Name");
                colour = JOptionPane.showInputDialog("Enter colour");
                playerArray[x] = new player(name, colour);
                jta.append(playerArray[x].toString());
            }

  JOptionPane.showMessageDialog(null,jta);

        }
    }
}


