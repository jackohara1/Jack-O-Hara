import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.Random;

public class test extends JFrame{
    public static void main(String[] args) {




        int amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of players"));

        while  (amount > 4 || amount < 2) {

            amount=Integer.parseInt(JOptionPane.showInputDialog(null,"im sorry but at least two and only four players can play", "error", JOptionPane.ERROR_MESSAGE));

        }


        player[] playerArray= new player[amount];
        String name, colourChoice;
        for (int x = 0; x < amount; x++) {
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


                playerArray[x]= new player(name, colourChoice, 1);



               }

        boardSetUp newBoard = new boardSetUp();

        int Xaxis=0, Yaxis=0, boardsize;






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

        newBoard.setYaxis(newBoard.getSpaces()/newBoard.getXaxis());





System.out.println(newBoard.getSpaces()+""+newBoard.getXaxis()+""+newBoard.getYaxis());

        JFrame frame2= new JFrame();
        frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setSize(750,500);
        frame2.setLayout(new GridLayout(newBoard.getXaxis(),newBoard.getYaxis()));

        boolean win = false;

        int pos, s=1;



        Random rand = new Random();



        JPanel[] spacePanelArray = new JPanel[newBoard.getSpaces()];
        spaces[] spacesArray = new spaces[newBoard.getSpaces()];







        for(int q=0;q<=newBoard.getYaxis();q++){

            for(int x=0; x<=newBoard.getXaxis();x++){

                if(q % 2 == 0){

                    spacesArray[s]= new spaces (x, q);
                }

                else{
                    spacesArray[s]= new spaces(newBoard.getXaxis()-x, q);

                }
                    spacePanelArray[s].setLocation(spacesArray[s].getXAxis(),spacesArray[s].getYAxis());
                    spacePanelArray[s].setBackground(Color.orange);









                spacePanelArray[s].setLayout(new GridLayout(2, 2));
                JPanel[] gridpanelArray = new JPanel[4];


                int a=1,b=1;

                for (int p=1; p<=4; p++ ){

                    gridpanelArray[p].setBackground(Color.orange);

                    if (p==1){ a=1;b=1;}
                    else if (p==2){a=1;b=2;}
                    else if (p==3){ a=2;b=1;}
                    else if (p==4){ a=2;b=2;}

                    gridpanelArray[p].setLocation(a,b);
                    spacePanelArray[s].add(gridpanelArray[p]);
                }
                frame2.add(spacePanelArray[s]);
                s++;



            }}



        while (!win) {



            for (int y = 0; y < newBoard.getSpaces(); y++) {

                int dice = rand.nextInt(6) + 1;

                JOptionPane.showMessageDialog(null, "Your go " + playerArray[y].getName() + " hit the dice to move");



                pos = SnL.dice(playerArray[y].getPosition(), dice, newBoard.getSpaces());

                spacePanelArray[pos-dice].gridPanelArray[y].setBackground(Color.orange);

                if (playerArray[y].getColour().equals("yellow")){
                    spacePanelArray[pos].gridPanelArray[y].setBackground(Color.yellow);
                }
                else if (playerArray[y].getColour().equals("green")){
                    spacePanelArray[pos].gridPanelArray[y].setBackground(Color.green);
                }
                else if (playerArray[y].getColour().equals("blue")){
                    spacePanelArray[pos].gridPanelArray[y].setBackground(Color.blue);
                }
                else if (playerArray[y].getColour().equals("red")){
                    spacePanelArray[pos].gridPanelArray[y].setBackground(Color.red);
                }

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

                    break;
                }//end of wining if statement
    }
}}}