public class Test{
    public static void main(String[] args) {
        PointCP5 point = new PointCP3(3, 3);

        long start = System.currentTimeMillis();

        for (int i= 0 ; i < 100000000; i++){
            point.getRho();
            point.getTheta();
        }
        long end = System.currentTimeMillis();

        long duration =  end - start;
        System.out.println("Duration Time : "+ duration);

        start = System.currentTimeMillis();

        for (int i= 0 ; i < 100000000; i++){
            point.getX();
            point.getY();
        }
        end = System.currentTimeMillis();

        duration =  end - start;
        System.out.println("Duration Time : "+ duration);

    }
}