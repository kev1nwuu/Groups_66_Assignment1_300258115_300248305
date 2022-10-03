import design5.PointCP5;

public class PointCP2 extends PointCP5{

    private char typeCoord;
    
    private double Rho;
    private double Theta;

    public PointCP2(double Rho, double Theta) // 
    {
      
      this.Rho = Rho;
      this.Theta = Theta;
      this.typeCoord = "P";

    }


    //Instance methods **************************************************

    public double getRho()
    {
        return Rho;
    }

    public double getTheta()
    {
        return Theta;
    }

    public double getX()
    {
        return (Math.cos(Math.toRadians(Theta)) * Rho);
    }
    
    public double getY()
    {
        return (Math.sin(Math.toRadians(Theta)) * Rho);
    }

    public String get_typeCoord(){
        return typeCoord;
    }


    public String toString()
    {
        return "\n Stored Polar coordinates [" + getRho() + "," +getTheta() +"]" + "\n The Cartesian coordinates are computed : (" +getX()+ "," +getY() +")";
    }




    
}