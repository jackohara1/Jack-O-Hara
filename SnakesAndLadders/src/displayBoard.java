import javax.swing.*;
import java.awt.*;

public class displayBoard extends JFrame{
   static JPanel[] playerPanelArray;
   static ImageIcon snakeheadimg = new ImageIcon("src\\images\\snakehead.png");
   static ImageIcon laddertailimg = new ImageIcon("src\\images\\laddertail.jpg");
public displayBoard(boardSetUp newBoard){

    setIconImage(new ImageIcon("images\\icon.png").getImage());

     setDefaultCloseOperation(EXIT_ON_CLOSE);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setLayout(new GridLayout(newBoard.getXaxis(),(newBoard.getYaxis()*2)));






    ImageIcon snaketailimg = new ImageIcon("src\\images\\snaketail.png");
    ImageIcon ladderheadimg = new ImageIcon("src\\images\\ladderhead.png");





    int s=newBoard.getSpaces(),w=0;
    JPanel[] spacePanelArray = new JPanel[100];
    playerPanelArray =new JPanel[100];
        for(int q=1; q<=newBoard.getYaxis();q++){

        for(int x=1; x<=newBoard.getXaxis()*2;x=x+2){



            playerPanelArray[w] = new JPanel();
            playerPanelArray[w].setLayout(new BorderLayout(10, 10));
            playerPanelArray[w].setLocation(x, q);
            playerPanelArray[w].setBackground(Color.cyan);

            playerPanelArray[w].setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, Color.black));//http://www.java2s.com/Code/JavaAPI/javax.swing/JPanelsetBorderBorderborder.htm

            spacePanelArray[w] = new JPanel();

            spacePanelArray[w].setLayout(new BorderLayout(10, 10));
            spacePanelArray[w].setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.black));//http://www.java2s.com/Code/JavaAPI/javax.swing/JPanelsetBorderBorderborder.htm

            spacePanelArray[w].setLocation(x, q+1);
            spacePanelArray[w].setBackground(Color.cyan);
            JTextArea spacetext = new JTextArea();
            spacetext.setText(""+(s)+"");
            spacetext.setBackground(Color.cyan);



            JLabel laddertail = new JLabel(laddertailimg);
            JLabel ladderhead = new JLabel(ladderheadimg);
            JLabel snaketail = new JLabel(snaketailimg);
            JLabel snakehead = new JLabel(snakeheadimg);


            //  spacePanelArray[w].setLayout(new FlowLayout);








            if ((int)(newBoard.getSpaces()*.3)==s){spacetext.setText(""+(s)+"   l1"); spacePanelArray[w].add(spacetext,BorderLayout.NORTH); spacePanelArray[w].add(laddertail,BorderLayout.CENTER);
            }
            else if ((int)(newBoard.getSpaces()*.52)==s){spacetext.setText(""+(s)+" l1"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(ladderhead);
            }

            else if ((int)(newBoard.getSpaces()*.62)==s){spacetext.setText(""+(s)+" s1"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(snakehead);
            }
            else if ((int)(newBoard.getSpaces()*.42)==s){spacetext.setText(""+(s)+" s1"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(snaketail);
            }

            else if (newBoard.getYaxis()>=4&&(int)(newBoard.getSpaces()*.67)==s){spacetext.setText(""+(s)+" l2"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(laddertail);
            }
            else if (newBoard.getYaxis()>=4&&(int)(newBoard.getSpaces()*.86)==s){spacetext.setText(""+(s)+" l2"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(ladderhead);
            }

            else if (newBoard.getYaxis()>=5&&(int)(newBoard.getSpaces()*.37)==s){spacetext.setText(""+(s)+" s2"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(snakehead);
            }
            else if (newBoard.getYaxis()>=5&&(int)(newBoard.getSpaces()*.21)==s){spacetext.setText(""+(s)+" s2"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(snaketail);
            }

            else if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.56)==s){spacetext.setText(""+(s)+" l3"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(laddertail);
            }
            else if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.72)==s){spacetext.setText(""+(s)+" l3"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(ladderhead);
            }

            else if (newBoard.getYaxis()>=7&&(int)(newBoard.getSpaces()*.91)==s){spacetext.setText(""+(s)+" s3"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(snakehead);
            }
            else if (newBoard.getYaxis()>=7&&(int)(newBoard.getSpaces()*.66)==s){spacetext.setText(""+(s)+" s3"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(snaketail);
            }

            else if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.17)==s){spacetext.setText(""+(s)+" l4"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(laddertail);
            }
            else if (newBoard.getYaxis()>=6&&(int)(newBoard.getSpaces()*.28)==s){spacetext.setText(""+(s)+" l4"); spacePanelArray[w].add(spacetext); spacePanelArray[w].add(ladderhead);
            }

            else{ spacetext.setText(""+(s)+""); spacePanelArray[w].add(spacetext); }









            if (s==0){break;}

            add(playerPanelArray[w]);
            add(spacePanelArray[w]);

            s--;
            w++;
        }}

setVisible(true);


}}
