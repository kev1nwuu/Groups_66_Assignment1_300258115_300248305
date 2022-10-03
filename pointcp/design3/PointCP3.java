package design3;

import design5.PointCP5;

public class PointCP3 extends PointCP5{

    private char typeCoord;
    
    private double X;
    private double Y;

    public PointCP3(double X, double Y)
    {
      
      this.X = X;
      this.X = Y;
      this.typeCoord = "C";
    }


    //Instance methods **************************************************

    public double getRho()
    {
        return (Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2)));
    }

    public double getTheta()
    {
        return Math.toDegrees(Math.atan2(Y, X));
    }

    public double getX()
    {
        return X;
    }
    
    public double getY()
    {
        return Y;
    }

    public String get_typeCoord(){
        return typeCoord;
    }

    public String toString()
    {
        return "\n Stored Cartesian coordinates [" + getX() + "," +getY() +"]" + "\n The polar coordinates are computed : (" +getRho()+ "," +getTheta() +")";
    }

    
}