import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;
import java.applet.Applet;
public class SnL {
    public SnL() {
    }



    public static int dice(int p, int dice, int z) {



        if (p+dice < z){

            p += dice;

            if(p+dice ==z){


            }

            }
            else if (p+dice > z){
                JOptionPane.showMessageDialog((Component)null, "you've gotten " +(dice)+ " too high try again");
                p= (z*2)-(p+dice);

            } return p;
            }

            public static int ladder1 (int p, int z)
            {

                        if (p == (int)(z*.3)) {
                            p = (int)(z*.52);
                            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                        }        return p;
            }

    public static int snake1 (int p, int z)
    {

                        if (p == (int)(z*.62)) {
                            p = (int)(z*.42);
                            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + p);
                        }
                        return p;
            }

    public static int ladder2 (int p, int z)
    {


                        if (p == (int)(z*.69)) {
                            p = (int)(z*.86);
                            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                        }
                return p;
            }

        public static int snake2 (int p, int z)
        {


             {
                        if (p == (int)(z*.37)) {
                            p = (int)(z*.21);
                            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + p);
                        }

            }        return p;
        }

    public static int ladder3 (int p, int z)
    {
            {

                if (p == (int)(z*.57)) {
                    p = (int)(z*.72);
                    JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                }
            }        return p;
    }

    public static int snake3 (int p, int z)
    {
             {
                if (p == (int)(z*.91)) {
                    p = (int)(z*.66);
                    JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + p);
                }

            }        return p;
    }

    public static int ladder4 (int p, int z)
    {
           {

               if (p == (int)(z*.17)) {
                   p = (int)(z*.29);
                   JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                    }

                }  return p;    }







    public static int retrivenewBoardsize(int b){
       boolean correct=false;

        while(!correct){
        for (int z = 9; z > 4; z--) {


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

            for (z = 9; z > 5; z--) {


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
