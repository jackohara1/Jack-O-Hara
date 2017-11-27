/*import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class runGame extends JFrame implements ActionListener {

    public void main(String args[]) {


        boardSetUp newBoard = MainMenu.newBoard();
        player[] playerArray= MainMenu.playerArray();

        runGame frame1 = new runGame();

        frame1.setVisible(true);




    } public runGame() {

            Container cPane;

            //set the frame properties
        MainMenu retrieve = new MainMenu();



            setIconImage(new ImageIcon("images\\icon.png").getImage());

            setTitle     ("Snakes and Ladders");

            setSize      (1000,750);

            setResizable (false);

            setLocation  (250,200);



            // shut down the program when the window is closed

            setDefaultCloseOperation(EXIT_ON_CLOSE);



            cPane = getContentPane();

            cPane.setLayout(new FlowLayout());


            GridLayout boardgrid = new GridLayout(newBoard.getXaxis(),newBoard.getYaxis());


            JPanel[] spacePanelArray = new JPanel[newBoard.getSpaces()];




            int s=1;





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



                        spacePanelArray[s].setLocation(spacesArray[s].getXAxis(),spacesArray[s].getYAxis());

                        spacePanelArray[s].setBackground(Color.orange);

                    }
                    Container spaceContainer;

                    GridLayout spacegrid = new GridLayout((int)(retrieve.amount/2), (int)(retrieve.amount/2));



                    spaceContainer = getContentPane();

                    spaceContainer.setLayout(spacegrid);

                    JPanel[] gridpanelArray = new JPanel[newBoard.getSpaces()];



                    for (int p=1; p>=retrieve.amount; p++ ){

                        int a=1,b=1;


                        spaceContainer.add(new JPanel());

                        gridpanelArray[p].setBackground(Color.orange);

                        if (p==1){ a=1;b=1;}
                        else if (p==2){a=1;b=2;}
                        else if (p==3){ a=2;b=1;}
                        else if (p==4){ a=2;b=2;}



                        gridpanelArray[p].setLocation(a,b);

                    }

                    s++;
                }













    /*JTextArea jta = new JTextArea("users:\n\n");




    String name, colour="",colourChoice;
    int position, pos, boardsize,s=1;
    boolean win=false, correct=false;





    boardsize = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many squares youd like on your board"));
    while (boardsize>100||boardsize<20){
        if (boardsize > 100) {
            JOptionPane.showMessageDialog(null, "im sorry but you cannot enter that many squares the max is 100", "error", JOptionPane.ERROR_MESSAGE);
            boardsize = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many squares youd like on your board"));
        }//if boardsize
        if (boardsize < 20) {
            JOptionPane.showMessageDialog(null, "im sorry but you have to enter more squares the minimum amount is 20", "error", JOptionPane.ERROR_MESSAGE);
            boardsize = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many squares youd like on your board"));
        }//if boardsize
    }//boardsize validation loop


    boardSetUp newBoard = new boardSetUp();


    while(!correct){
        for (int z = 9; z > 4; z--) {


            if((boardsize%z) == 0){

                newBoard.setXaxis(z);
                newBoard.setYaxis(boardsize/z);
                correct=true;
                break;

            }//end of if
        }//end of for loop

        if (correct){
            break;
        }//if to exit the while loop
        else {
            boardsize += 1;

        }//else to edit boardsize entered
    }//loop to set x and y axis



    System.out.print(newBoard.getXaxis()+"\n"+newBoard.getYaxis()+"\n"+boardsize+"\n");


    GridLayout boardLayout = new GridLayout(newBoard.getXaxis(),newBoard.getYaxis());
    final JPanel finalboard = new JPanel();


   spaces[] spacesArray= new spaces[boardsize];

    JPanel[] spacePanelArray = new JPanel[boardsize];

    for(int q=0;q<=newBoard.getYaxis();q++){
        for(int x=0; x<=newBoard.getXaxis();x++){


            if(q % 2 == 0){

                System.out.print(q+""+x+"..");
               spacesArray[s].setXAxis(x);
            }
            else{
                System.out.print(q+""+(newBoard.getXaxis()-x)+"..");
                spacesArray[s].setXAxis(newBoard.getXaxis()-x);
            }


            spacesArray[s].setYAxis(q);
         //   JPanel[] spacePanelArray = new JPanel[s];
           // spacePanelArray[s].setBackground(Color.BLUE);
            s++;

        }
        System.out.print("\n");
    }


    int amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of players"));
    if (amount > 4 || amount <2) {
        JOptionPane.showMessageDialog(null, "im sorry but at least two and only four players can play", "error", JOptionPane.ERROR_MESSAGE);
    }//validation for entering the right amount of players

    boolean[] myBool = new boolean[amount];

    player[] playerArray= new player[amount];

    for (int x = 0; x < amount; x++) {

        name = JOptionPane.showInputDialog("Enter Name");
        colourChoice=JOptionPane.showInputDialog("Enter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();

        while(!colourChoice.equals("B")&&!colourChoice.equals("R")&&!colourChoice.equals("Y")&&!colourChoice.equals("G")){

            colourChoice=JOptionPane.showInputDialog("That is not one of the letters\nEnter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();
        }//validation for colour
        if(colourChoice.equals("B")){
            colour="blue"; }

        if(colourChoice.equals("R")){
            colour="red"; }

        if(colourChoice.equals("Y")){
            colour="yellow"; }

        if(colourChoice.equals("G")){
            colour="green"; }

        position=1;
        playerArray[x] = new player(name, colour, position);
        jta.append(playerArray[x].toString());



    }//end of for loop




    while(!win) {

        for(int y=0; y<amount; y++){
            JOptionPane.showMessageDialog(null,


                    "Your go "+playerArray[y].getName() + " hit the dice to move");
            pos=SnL.dice(playerArray[y].getPosition(), newBoard.getXaxis(), newBoard.getYaxis());

            playerArray[y].setPosition(pos);


            if (pos==35){
                win=true;
                JOptionPane.showMessageDialog((Component)null, "congradulations " + playerArray[y].getName()+"you won");
            }//end of wining if statement
        }//end of for loop for checking if winner
    }//end of while loop checking for winner
*/
