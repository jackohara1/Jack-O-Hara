public class boardSetUp {


    private int xaxis;
    private int yaxis;

    public boardSetUp(){ this( 7,  8);}


    public boardSetUp(int xaxis,int yaxis){
        setXaxis(xaxis);
        setYaxis(yaxis);

    }


    public int getXaxis() {
        return xaxis;
    }

    public int getYaxis(){
        return yaxis;
    }





    public void setXaxis(int xaxis) { this.xaxis = xaxis;}

    public void setYaxis(int yaxis) {
        this.yaxis = yaxis;
    }




}