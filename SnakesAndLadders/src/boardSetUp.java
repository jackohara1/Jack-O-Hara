public class boardSetUp {

    private int spaces;
    private int xaxis;
    private int yaxis;

    public boardSetUp(){ this( 7,  8, 56);}


    public boardSetUp(int xaxis,int yaxis, int spaces){
        setXaxis(xaxis);
        setYaxis(yaxis);
        setSpaces(spaces);
    }


    public int getXaxis() {
        return xaxis;
    }

    public int getYaxis(){
        return yaxis;
    }

    public int getSpaces() { return spaces;}




    public void setXaxis(int xaxis) { this.xaxis = xaxis;}

    public void setYaxis(int yaxis) {
        this.yaxis = yaxis;
    }

    public void setSpaces(int spaces) {this.spaces= spaces;}



}