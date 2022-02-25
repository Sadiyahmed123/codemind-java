import java.util.Scanner;
class Area{
    public static void main(String args[])
    {
        int radius;
        Scanner s=new Scanner(System.in);
        radius=s.nextInt();
        double Area=0;
        Area=3.14*radius*radius;
        System.out.printf("%.2f",Area);
    }
}