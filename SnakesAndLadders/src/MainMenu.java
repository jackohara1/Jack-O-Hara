import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.Random;





public class MainMenu extends JFrame implements ActionListener

{

    JMenu playerMenu;

    JMenu boardMenu;

    JMenu startMenu;












    public static void main(String[] args) {
        int amount;





        MainMenu frame1 = new MainMenu();

        frame1.setVisible(true);




    }



    public MainMenu() {

        Container cPane;











        setIconImage(new ImageIcon("images\\icon.png").getImage());

        setTitle     ("Snakes and Ladders");

        setSize      (1000,750);



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

        JLabel background = new JLabel(new ImageIcon("images//MenuImage.jpg"));
        background.setVisible(true);

        cPane.add(background);

        JButton Dice;

    } // end constructor



    /** when an item is clicked, response starts here */

    public void actionPerformed(ActionEvent event) {

        String menuName;
        int amount=4;

        player[] playerArray= new player[amount];
        boardSetUp newBoard = new boardSetUp();
        spaces[] spacesArray = new spaces[newBoard.getSpaces()];


        menuName = event.getActionCommand(); // what's written on the item that was clicked

        // note the String comparison

        if (menuName.equals("Quit")) {

            System.exit(0);

        } // end if

        else if (menuName.equals("add")) {




             amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of players"));

            while  (amount > 4 || amount < 2) {

                amount=Integer.parseInt(JOptionPane.showInputDialog(null,"im sorry but at least two and only four players can play", "error", JOptionPane.ERROR_MESSAGE));

            }



                for (int x = 0; x < amount; x++) {



                    String name, colourChoice;



                    name = JOptionPane.showInputDialog("Enter Name");

                    colourChoice = JOptionPane.showInputDialog("Enter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();



                    while (!colourChoice.equals("B") && !colourChoice.equals("R") && !colourChoice.equals("Y") && !colourChoice.equals("G")) {



                        colourChoice = JOptionPane.showInputDialog("That is not one of the letters\nEnter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();

                    }//validation for colour

                    if (colourChoice.equals("B")) {
                        colourChoice = "blue";
                    }

                    if (colourChoice.equals("R")) {
                        colourChoice = "red";
                    }

                    if (colourChoice.equals("Y")) {
                        colourChoice = "yellow";
                    }

                    if (colourChoice.equals("G")) {
                        colourChoice = "green";
                    }

                    playerArray[x].setColour(colourChoice);

                    playerArray[x].setName(name);

                    playerArray[x].setPosition(1);

                }



                //validation for entering the right amount of players

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


                 JFrame frame2= new JFrame();
                 frame2.setVisible(true);





            GridLayout boardgrid = new GridLayout(newBoard.getXaxis(),newBoard.getYaxis());

            JPanel[] spacePanelArray = new JPanel[newBoard.getSpaces()];

            boolean win = false;

            int pos, s=1;



                Random rand = new Random();

                Container boardContainer;

                boardContainer= getContentPane();



                boardContainer.setLayout(boardgrid);





                for(int q=0;q<=newBoard.getYaxis();q++){

                    for(int x=0; x<=newBoard.getXaxis();x++){







                        if(q % 2 == 0){

                            spacesArray[s].setXAxis(x);
                        }

                        else{
                            spacesArray[s].setXAxis(newBoard.getXaxis()-x);

                        }


                        spacesArray[s].setYAxis(q);

                        boardContainer.add(new JPanel());{

                            setBackground(Color.orange);



                            spacePanelArray[q].setLocation(spacesArray[s].getXAxis(),spacesArray[s].getYAxis());

                            spacePanelArray[q].setBackground(Color.orange);

                        }







                        Container spaceContainer;

                        GridLayout spacegrid = new GridLayout(2, 2);



                        spaceContainer = getContentPane();

                        spaceContainer.setLayout(spacegrid);

                        JPanel[] gridpanelArray = new JPanel[newBoard.getSpaces()];

                        int a=1,b=1;

                        for (int p=1; p<=4; p++ ){





                            setBackground(Color.orange);

                            if (p==1){ a=1;b=1;}
                            else if (p==2){a=1;b=2;}
                            else if (p==3){ a=2;b=1;}
                            else if (p==4){ a=2;b=2;}

                            gridpanelArray[p].setLocation(a,b);
                            spaceContainer.add(gridpanelArray[p]);
                        }

                        s++;



                    }}



                while (!win) {



                for (int y = 0; y < newBoard.getSpaces(); y++) {

                    int dice = rand.nextInt(6) + 1;

                    JOptionPane.showMessageDialog(null, "Your go " + playerArray[y].getName() + " hit the dice to move");

                    pos = SnL.dice(playerArray[y].getPosition(), dice);





                    pos=SnL.ladder1(pos,newBoard.getSpaces());

                    pos=SnL.snake1(pos,newBoard.getSpaces());

                    if (newBoard.getYaxis()>=4){ pos=SnL.ladder2(pos,newBoard.getSpaces());}

                    if (newBoard.getYaxis()>=5){ pos=SnL.snake2(pos,newBoard.getSpaces());}

                    if (newBoard.getYaxis()>=6){ pos=SnL.ladder3(pos,newBoard.getSpaces());}

                    if (newBoard.getYaxis()>=7){ pos=SnL.snake3(pos,newBoard.getSpaces());}

                    if (newBoard.getYaxis()>=8){ pos=SnL.ladder4(pos,newBoard.getSpaces());}

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

    public void createPlayerMenu() {

        JMenuItem    item;

        playerMenu = new JMenu("Player");

        item = new JMenuItem("add");

        item.addActionListener( this );

        playerMenu.add( item );

        playerMenu.addSeparator();





    } // end createFileMenu



    public void createBoardMenu( ) {

        JMenuItem    item;



        boardMenu = new JMenu("Board");



        item = new JMenuItem("boardsize");      //Cut

        item.addActionListener( this );

        boardMenu.add( item );





    }



    public void createStartMenu( ) {

        JMenuItem    item;



        startMenu = new JMenu("Play");



        item = new JMenuItem("PlayGame");      //Cut

        item.addActionListener( this );

        startMenu.add( item );





    }// end createEditMenu

} // end class

   /*

*/