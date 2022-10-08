

public class PointCP3 extends PointCP5{

    
    private double X;
    private double Y;

    public PointCP3(double X, double Y)
    {
      
      this.X = X;
      this.Y = Y;
      
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

    public PointCP2 convertStorageToPolar(){
      return new PointCP2(getRho(), getTheta());
    } 

    public PointCP3 convertStorageToCartesian()
    { return new PointCP3(X, Y);
    } 

    public double getDistance(PointCP3 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }



  public PointCP5 rotatePoint(double rotation)
  {
    double radRotation = Math.toRadians(rotation);
        
    return new PointCP3(
      (Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
      (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
  }


    public String toString()
    {
        return "Stored as Cartesian  (" + getX() + "," + getY() + ")"+"\n";
    }

    
}