import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainMenu extends JFrame implements ActionListener
{
    JMenu playerMenu;
    JMenu boardMenu;
    JMenu startMenu;
    JLabel response; // to hold a result from the menus

    int amount;

    boardSetUp newBoard = new boardSetUp();
    player[] playerArray= new player[amount];
    public static void main(String[] args) {
        MainMenu frame = new MainMenu();
        frame.setVisible(true);


    }

    public MainMenu() {
        Container cPane;
       //set the frame properties
        setIconImage(new ImageIcon(".\\images\\icon.png").getImage());
        setTitle     ("Snakes and Ladders");
        setSize      (300,200);
        setResizable (false);
        setLocation  (250,200);
        // shut down the program when the window is closed
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane( );
        cPane.setLayout(new FlowLayout());

        //invoke a user-written method create two menus and their menu items
        // done by separate method to make the constructor shorter
        createPlayerMenu();
        createBoardMenu();
        createStartMenu();
        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.yellow);
        menuBar.add(playerMenu);
        menuBar.add(boardMenu);
        menuBar.add(startMenu);
        //create and position reponse label
        response = new JLabel("Hello, this is your menu tester." );
        response.setSize(250, 50); // optional
        cPane.add(response);
        getClass().getResource("/resources/images/MenuImage.png");
    } // end constructor

    /** when an item is clicked, response starts here */
    public void actionPerformed(ActionEvent event) {
        String menuName;
        menuName = event.getActionCommand(); // what's written on the item that was clicked
        // note the String comparison
        if (menuName.equals("Quit")) {
            System.exit(0);
        } // end if
        else if (menuName.equals("add")) {
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of players"));
            if (amount > 4 || amount < 2) {
                JOptionPane.showMessageDialog(null, "im sorry but at least two and only four players can play", "error", JOptionPane.ERROR_MESSAGE);
            }


            for (int x = 0; x < amount; x++) {
                playerArray[x].setName(playerDriver.name());
                playerArray[x].setColour(playerDriver.colour());
                playerArray[x].setPosition(1);
            }//validation for entering the right amount of players
        } // end else

        else if (menuName.equals("boardsize")) {
            int Xaxis = 0, Yaxis = 0, boardsize;

            boardsize = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many squares youd like on your board"));
            while (boardsize > 100 || boardsize < 20) {
                if (boardsize > 100) {
                    JOptionPane.showMessageDialog(null, "im sorry but you cannot enter that many squares the max is 100", "error", JOptionPane.ERROR_MESSAGE);
                    boardsize = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many squares youd like on your board"));
                }//if boardsize
                if (boardsize < 20) {
                    JOptionPane.showMessageDialog(null, "im sorry but you have to enter more squares the minimum amount is 20", "error", JOptionPane.ERROR_MESSAGE);
                    boardsize = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many squares youd like on your board"));
                }//if boardsize
            }//boardsize validation loop

            newBoard.setSpaces(SnL.retrivenewBoardsize(boardsize));
            newBoard.setXaxis(SnL.retriveXaxis(boardsize, Xaxis));
            newBoard.setYaxis(SnL.retriveYaxis(boardsize, Xaxis, Yaxis));
        } else if (menuName.equals("playGame")) {
            boolean win = false;
            int pos;
            while (!win) {

                for (int y = 0; y < newBoard.getSpaces(); y++) {
                    JOptionPane.showMessageDialog(null,


                            "Your go " + playerArray[y].getName() + " hit the dice to move");
                    pos = SnL.dice(playerArray[y].getPosition(), newBoard.getXaxis(), newBoard.getYaxis());

                    playerArray[y].setPosition(pos);


                    if (pos == 35) {
                        win = true;
                        JOptionPane.showMessageDialog((Component) null, "congradulations " + playerArray[y].getName() + "you won");
                    }//end of wining if statement
                }
            }


        } // end actionPerformend
    }
    /**  Creates File menu and its menu items */
    private void createPlayerMenu() {
        JMenuItem    item;
        playerMenu = new JMenu("Player");
        item = new JMenuItem("add");
        item.addActionListener( this );
        playerMenu.add( item );
        playerMenu.addSeparator();


    } // end createFileMenu

    private void createBoardMenu( ) {
        JMenuItem    item;

        boardMenu = new JMenu("Board");

        item = new JMenuItem("boardsize");      //Cut
        item.addActionListener( this );
        boardMenu.add( item );


    }

    private void createStartMenu( ) {
        JMenuItem    item;

        startMenu = new JMenu("Play");

        item = new JMenuItem("PlayGame");      //Cut
        item.addActionListener( this );
        startMenu.add( item );


    }// end createEditMenu
} // end class
   /*
*/