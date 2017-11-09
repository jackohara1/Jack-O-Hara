
public class player {


    private String name;
    private String colour;



    public player(){
        this("player n","blue");
    }


    public player(String name,String colour){
        setColour(colour);
        setName(name);
    }



    public String getColour() {
        return colour;
    }

    public String getName(){
        return name;
    }





    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return String.format(" Name:%20s\n Colour:%20s\n\n",
                getName(),getColour());
    }




}

