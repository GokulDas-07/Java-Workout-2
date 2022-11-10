import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the edgelenth of Tile:");
        int edgeLenth=input.nextInt();
        Tile tile=new Tile(edgeLenth);
        System.out.println("Enter length and width of Floor:");
        int floorLength=input.nextInt();
        int floorWidth=input.nextInt();
        Floor floor=new Floor(floorLength,floorWidth);
        System.out.println("Total tile needed:"+floor.totalTiles(tile));
    }
}