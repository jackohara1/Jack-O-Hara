import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.util.Random;

public class test extends JFrame{
    public static void main(String[] args) {

        boardSetUp newBoard = new boardSetUp();

        int Xaxis=0, boardsize;






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


                playerArray[x]= new player(name, colourChoice, newBoard.getSpaces()-1);



               }











System.out.println(newBoard.getSpaces()+""+newBoard.getXaxis()+""+newBoard.getYaxis());

        JFrame frame2= new JFrame("snakes and ladders");
        frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame2.setVisible(true);
        //frame2.setSize(newBoard.getXaxis()*200,newBoard.getYaxis()*200);
        frame2.setLayout(new GridLayout(newBoard.getXaxis(),(newBoard.getYaxis()+1)));

        ImageIcon diceimage =new ImageIcon("src\\images\\one.png");
        JButton one = new JButton(diceimage);

        one.setSize(1/10,1/10);


        ImageIcon snakeheadimg = new ImageIcon("src\\images\\snakehead.png");
        ImageIcon snaketailimg = new ImageIcon("src\\images\\snaketail.png");
        ImageIcon ladderheadimg = new ImageIcon("src\\images\\ladderhead.png");
        ImageIcon laddertailimg = new ImageIcon("src\\images\\laddertail.png");
        JLabel laddertail = new JLabel(laddertailimg);
        JLabel ladderhead = new JLabel(ladderheadimg);
        JLabel snaketail = new JLabel(snaketailimg);
        JLabel snakehead = new JLabel(snakeheadimg);

        int pos, s=newBoard.getSpaces(),w=0;
        JPanel[] spacePanelArray = new JPanel[100];

        for(int q=0; q<=newBoard.getYaxis();q++){

            for(int x=0; x<newBoard.getXaxis();x++){

                spacePanelArray[w] = new JPanel();

              //  if(q % 2 == 0){
                    spacePanelArray[w].setLocation(x, q+1);
                    spacePanelArray[w].setBackground(Color.cyan);
                    JTextArea spacetext = new JTextArea();
                    spacetext.setText(""+(s)+"");
                    spacetext.setBackground(Color.cyan);
                    spacePanelArray[w].add(spacetext);
                    spacePanelArray[w].setLayout(new GridLayout(2, 2));


               /*if ((int)(newBoard.getSpaces()*.3)==s){spacePanelArray[w].add(laddertail);}
                if ((int)(newBoard.getSpaces()*.52)==s){spacePanelArray[w].add(ladderhead);}

                if ((int)(newBoard.getSpaces()*.62)==s){spacePanelArray[w].add(snakehead);}
                if ((int)(newBoard.getSpaces()*.42)==s){spacePanelArray[w].add(snaketail);}

                if (newBoard.getYaxis()>=4&&(int)(newBoard.getSpaces()*.67)==w){spacePanelArray[w].add(laddertail);}
                if (newBoard.getYaxis()>=4&&(int)(newBoard.getSpaces()*.86)==w){spacePanelArray[w].add(ladderhead);}

                if (newBoard.getYaxis()>=5&&(int)(newBoard.getSpaces()*.32)==w){spacePanelArray[w].add(snakehead);}
                if (newBoard.getYaxis()>=5&&(int)(newBoard.getSpaces()*.21)==w){spacePanelArray[w].add(snaketail);}

                if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.57)==w){spacePanelArray[w].add(laddertail);}
                if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.72)==w){spacePanelArray[w].add(ladderhead);}

                if (newBoard.getYaxis()>=7&&(int)(newBoard.getSpaces()*.91)==w){spacePanelArray[w].add(snakehead);}
                if (newBoard.getYaxis()>=7&&(int)(newBoard.getSpaces()*.66)==w){spacePanelArray[w].add(snaketail);}

                if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.12)==w){spacePanelArray[w].add(laddertail);}
                if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.29)==w){spacePanelArray[w].add(ladderhead);}*/






/*
                JPanel[] gridpanelArray = new JPanel[4];

                for (int p=1; p<=5; p++ ){
                    int a=1,b=1;
                    gridpanelArray[p]=new JPanel();
                    gridpanelArray[p].setBackground(Color.orange);
                    gridpanelArray[p].setSize(50,40);
                    if (p==1){ a=1;b=1;}
                    else if (p==2){a=1;b=2;}
                    else if (p==3){ a=2;b=1;}
                    else if (p==4){ a=2;b=2;}

                    gridpanelArray[p].setLocation(a,b);
                    spacePanelArray[s].add(gridpanelArray[p]);
                }*/

        if (s==0){break;}
        frame2.add(spacePanelArray[w]);
                s--;
                w++;
            }}
            one.setLocation(1,1);
        frame2.add(one);

        boolean win = false;
        Random rand = new Random();
        ImageIcon two =new ImageIcon("src\\images\\two.png");
        ImageIcon three =new ImageIcon("src\\images\\three.png");
        ImageIcon four =new ImageIcon("src\\images\\four.png");
        ImageIcon five =new ImageIcon("src\\images\\five.png");
        ImageIcon six =new ImageIcon("src\\images\\six.png");

        while (!win) {



            for (int y = 0; y < newBoard.getSpaces(); y++) {

                int dice = rand.nextInt(6) + 1;

                //JOptionPane.showMessageDialog(null, "Your go " + playerArray[y].getName() + " hit the dice to move");


                if (dice==1){one.setVisible(true);
                    //two.setVisible(false);;
                    }

                spacePanelArray[playerArray[y].getPosition()].setBackground(Color.cyan);
/*.gridPanelArray[y]*/
                pos = SnL.dice(playerArray[y].getPosition(), dice);



                if (playerArray[y].getColour().equals("yellow")){
                    spacePanelArray[pos]/*.gridPanelArray[y]*/.setBackground(Color.yellow);
                }
                else if (playerArray[y].getColour().equals("green")){
                    spacePanelArray[pos]/*.gridPanelArray[y]*/.setBackground(Color.green);
                }
                else if (playerArray[y].getColour().equals("blue")){
                    spacePanelArray[pos]/*.gridPanelArray[y]*/.setBackground(Color.blue);
                }
                else if (playerArray[y].getColour().equals("red")){
                    spacePanelArray[pos]/*.gridPanelArray[y]*/.setBackground(Color.red);
                }

                pos=SnL.ladder1(pos,newBoard.getSpaces());

                pos=SnL.snake1(pos,newBoard.getSpaces());

                if (newBoard.getYaxis()>=4){ pos=SnL.ladder2(pos,newBoard.getSpaces());}

                if (newBoard.getYaxis()>=5){ pos=SnL.snake2(pos,newBoard.getSpaces());}

                if (newBoard.getYaxis()>=6){ pos=SnL.ladder3(pos,newBoard.getSpaces());}

                if (newBoard.getYaxis()>=7){ pos=SnL.snake3(pos,newBoard.getSpaces());}

                if (newBoard.getYaxis()>=8){ pos=SnL.ladder4(pos,newBoard.getSpaces());}

                playerArray[y].setPosition(pos);



                if (pos == 0) {

                    win = true;

                    JOptionPane.showMessageDialog((Component) null, "congradulations " + playerArray[y].getName() + "you won");

                    break;
                }//end of wining if statement
    }
}}}