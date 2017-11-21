import javax.swing.*;
import java.awt.*;

public class playerDriver{
    public static String name() {
        String name;


        name = JOptionPane.showInputDialog("Enter Name");
        return name;
    }
public static String colour() {

        String colour;





        colour = JOptionPane.showInputDialog("Enter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();

        while (!colour.equals("B") && !colour.equals("R") && !colour.equals("Y") && !colour.equals("G")) {

            colour = JOptionPane.showInputDialog("That is not one of the letters\nEnter colour 'B' blue, 'R' red, 'Y' yellow, 'G' green ").toUpperCase();
        }//validation for colour
        if (colour.equals("B")) {
            colour = "blue";
        }

        if (colour.equals("R")) {
            colour = "red";
        }

        if (colour.equals("Y")) {
            colour = "yellow";
        }

        if (colour.equals("G")) {
            colour = "green";
        }
        return colour;
    }}




