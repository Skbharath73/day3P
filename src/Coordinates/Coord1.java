package Coordinates;
import java.util.Scanner;
public class Coord1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        s.close();
        System.out.print("("+x+","+y+")");
        System.out.println("("+a+","+b+")");
        double l;
        l=Math.sqrt((int)Math.pow((a-x),2)+(int)Math.pow((b-y),2));

        System.out.println("Length:"+l);

    }
}
