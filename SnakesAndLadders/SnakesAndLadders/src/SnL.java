import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import java.applet.Applet;
public class SnL {
    public SnL() {


    }


            public static int ladder1 (int p, int z)
            {


                            p =(int)(z*.48);
                JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder","ladder",JOptionPane.PLAIN_MESSAGE,displayBoard.laddertailimg);
                                return p;
            }

    public static int snake1 (int p, int z)
    {


                            p = (int)(z*.58);
        JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake","snake",JOptionPane.PLAIN_MESSAGE,displayBoard.snakeheadimg);

                        return p;
            }

    public static int ladder2 (int p, int z)
    {



                            p = (int)(z*.14);
        JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder","ladder",JOptionPane.PLAIN_MESSAGE,displayBoard.laddertailimg);

                return p;
            }

        public static int snake2 (int p, int z)
        {


             {

                            p = (int)(z*.79);
                 JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake","snake",JOptionPane.PLAIN_MESSAGE,displayBoard.snakeheadimg);


            }        return p;
        }

    public static int ladder3 (int p, int z)
    {
            {


                    p = (int)(z*.28);
                JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder","ladder",JOptionPane.PLAIN_MESSAGE,displayBoard.laddertailimg);

            }        return p;
    }

    public static int snake3 (int p, int z)
    {


                    p = (int)(z*.34);
        JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake","snake",JOptionPane.PLAIN_MESSAGE,displayBoard.snakeheadimg);


                  return p;
    }

    public static int ladder4 (int p, int z)
    {



                   p = (int)(z*.72);
                   JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder","ladder",JOptionPane.PLAIN_MESSAGE,displayBoard.laddertailimg);


                  return p;    }







    public static int retrivenewBoardsize(int b){
       boolean correct=false;

        while(!correct){
        for (int z = 9; z >= 5; z--) {


            if((b%z) == 0){


                correct=true;
                break;
            }//end of if
        }//end of for loop
        if (correct){
            break;
        }//if to exit the while loop
        else {
            b += 1;

        }//else to edit boardsize entered
    }//loop to set x and y axis



    return b;

}

public static int retriveXaxis(int b,int x){

int z;

            for (z = 10; z >= 5; z--) {


                if((b%z) == 0){




                    break;
                }//end of if
            }//end of for loop
           //else to edit boardsize entered
             x=z;



        return x;
}
    public static int retriveYaxis(int b,int x, int y){





        y  = b/x;

        return y;
    }
    public static String colourValidation1(String colour){

        while (!colour.equals("B") && !colour.equals("R") && !colour.equals("Y") && !colour.equals("G")) {



            colour = JOptionPane.showInputDialog("The Colour you entered is not a valid colour" +
                    "Enter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();



        } return colour;}

    public static String colourValidation2(String colour, String p1colour){

        while (!colour.equals("B") && !colour.equals("R") && !colour.equals("Y") && !colour.equals("G") ||
        colour.equals(p1colour)) {



            colour = JOptionPane.showInputDialog("The Colour you entered is not valid either because it is not one of the colours avalible or\n" +
                    "One of the players before you has picked that colour\n" +
                    "Enter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();

        }
    return colour;}

    public static String colourValidation3(String colour, String p1colour, String p2colour){

        while (!colour.equals("B") && !colour.equals("R") && !colour.equals("Y") && !colour.equals("G") ||
       colour.equals(p1colour)|| colour.equals(p2colour)) {



            colour = JOptionPane.showInputDialog("The Colour you entered is not valid either because it is not one of the colours avalible or\n" +
                    "One of the players before you has picked that colour\n" +
                    "Enter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();

        }
    return colour;}

    public static String colourValidation4(String colour, String p1colour, String p2colour, String p3colour){

        while (!colour.equals("B") && !colour.equals("R") && !colour.equals("Y") && !colour.equals("G") ||
        colour.equals(p1colour) || colour.equals(p2colour)||
                colour.equals(p3colour)) {


            colour = JOptionPane.showInputDialog("The Colour you entered is not valid either because it is not one of the colours avalible or\n" +
                    "One of the players before you has picked that colour\n" +
                    "Enter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();

        }
    return colour;}
}
