package Coordinates;
import java.util.Scanner;
public class Coord2 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int X=s.nextInt();
        int Y=s.nextInt();
        int A=s.nextInt();
        int B=s.nextInt();
        s.close();
        System.out.print("("+x+","+y+")");
        System.out.println("("+a+","+b+")");
        System.out.print("("+X+","+Y+")");
        System.out.println("("+A+","+B+")");
        double l,L;
        l=Math.sqrt((int)Math.pow((a-x),2)+(int)Math.pow((b-y),2));
        L=Math.sqrt((int)Math.pow((A-X),2)+(int)Math.pow((B-Y),2));
        System.out.println("Length1:"+l);
        System.out.println("Length2:"+L);

        if(l == L) {
            System.out.println("Both are Equal");
        }
        else
            System.out.println("Both are not Equal");
    }
}
