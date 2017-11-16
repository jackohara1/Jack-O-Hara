
public class player {


    private String name;
    private String colour;



    private int position;






    public player(){
        this("player n","blue",1);
    }


    public player(String name,String colour,int position){
        setColour(colour);
        setName(name);
        setPosition(position);
    }



    public String getColour() {
        return colour;
    }

    public String getName(){
        return name;
    }

    public int getPosition() {return position; }



    public void setPosition(int position) { this.position = position;}

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return  "name=" + name +
                "\n colour=" + colour  +
                "\n position=" + position +"\n\n";
    }
}

