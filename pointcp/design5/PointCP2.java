

public class PointCP2 extends PointCP5{

    
    
    private double Rho;
    private double Theta;

    public PointCP2(double Rho, double Theta) // 
    {
      
      this.Rho = Rho;
      this.Theta = Theta;
      

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

    
    
    public PointCP2 convertStorageToPolar(){
        return new PointCP2(Rho, Theta);
    }

    public PointCP3 convertStorageToCartesian()
    { return new PointCP3(getX(), getY());
    }    
    

    public double getDistance(PointCP2 pointB)
  {
    // Obtain differences in X and Y, sign is not important as these values
    // will be squared later.
    double deltaX = getX() - pointB.getX();
    double deltaY = getY() - pointB.getY();
    
    return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
  }

  public PointCP2 rotatePoint(double rotation)
  {     return new PointCP2(Rho, rotation + Theta);
    
  }  

    public String toString()
    {
        return  "Stored as " + "Polar [" + getRho() + "," + getTheta() + "]" + "\n";
    }




    
}