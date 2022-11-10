import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter RoomArea, HallArea, Price, Room2Area for TwoBHK1 :");
        TwoBHK TwoBHK1 = new TwoBHK(input.nextFloat(),input.nextFloat(),input.nextDouble(),input.nextFloat());
        TwoBHK1.show();
        System.out.println("Enter RoomArea, HallArea, Price, Room2Area for TwoBHK2 :");
        TwoBHK TwoBHK2 = new TwoBHK(input.nextFloat(),input.nextFloat(),input.nextDouble(),input.nextFloat());
        TwoBHK2.show();
        System.out.println("Enter RoomArea, HallArea, Price, Room2Area for TwoBHK3 :");
        TwoBHK TwoBHK3 = new TwoBHK(input.nextFloat(),input.nextFloat(),input.nextDouble(),input.nextFloat());
        TwoBHK3.show();
        double total= TwoBHK1.price+TwoBHK2.price+TwoBHK3.price;
        System.out.println("Total cost:"+total);


    }
}