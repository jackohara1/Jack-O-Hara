import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import java.applet.Applet;
public class SnL {
    public SnL() {
    }



    public static int dice(int p, int dice) {



        if (p-dice < 0){

            p -= dice;

        }



            else if (p-dice < 0){
                JOptionPane.showMessageDialog((Component)null, "you've gotten " +(dice)+ " too high try again");
                p= (p-dice)*(-1);

            } return p;
            }

            public static int ladder1 (int p, int z)
            {


                            p =(int)(z*.48);
                            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder");
                                return p;
            }

    public static int snake1 (int p, int z)
    {


                            p = (int)(z*.58);
                            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake");

                        return p;
            }

    public static int ladder2 (int p, int z)
    {



                            p = (int)(z*.14);
                            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder");

                return p;
            }

        public static int snake2 (int p, int z)
        {


             {

                            p = (int)(z*.79);
                            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake");


            }        return p;
        }

    public static int ladder3 (int p, int z)
    {
            {


                    p = (int)(z*.28);
                    JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder ");

            }        return p;
    }

    public static int snake3 (int p, int z)
    {
             {

                    p = (int)(z*.44);
                    JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake");


            }        return p;
    }

    public static int ladder4 (int p, int z)
    {
           {


                   p = (int)(z*.71);
                   JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder");


                }  return p;    }







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

            for (z = 9; z >= 5; z--) {


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

}
