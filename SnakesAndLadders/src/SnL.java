import java.awt.Component;
import java.util.Random;
import javax.swing.JOptionPane;

public class SnL {
    public SnL() {
    }



    public static int dice(int p, int x, int y) {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1, z=x*y;


        if (p+dice < z){

            p += dice;





                        JOptionPane.showMessageDialog((Component)null, "You got " + dice + " your new score is " + p);
                        if (p == (int)(z*.3)) {
                            p = (int)(z*.52);
                            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                        }

                        if (p == (int)(z*.62)) {
                            p = (int)(z*.42);
                            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + p);
                        }

            if (y>=4){

                        if (p == (int)(z*.69)) {
                            p = (int)(z*.86);
                            JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                        }
            }

            if (y>= 5) {
                        if (p == (int)(z*.37)) {
                            p = (int)(z*.21);
                            JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + p);
                        }

            }
            if (y>=6){

                if (p == (int)(z*.57)) {
                    p = (int)(z*.72);
                    JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                }
            }
            if (y>= 7) {
                if (p == (int)(z*.91)) {
                    p = (int)(z*.66);
                    JOptionPane.showMessageDialog((Component)null, "Oh no you went down the snake your new score is " + p);
                }

            }
            if (y>= 8){

               if (p == (int)(z*.17)) {
                   p = (int)(z*.29);
                   JOptionPane.showMessageDialog((Component)null, "Wohoo you went up the ladder your new score is " + p);
                    }

                }      }
         if(p+dice ==z){



             return p=z;
         }
        else if (p+dice > z){
                             JOptionPane.showMessageDialog((Component)null, "you've gotten " +(dice)+ " too high try again");
              p= (z*2)-(p+dice);
        }

        System.out.println(p + "\n");
        return p;

}}
