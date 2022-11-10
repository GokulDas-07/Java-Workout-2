public class TwoBHK extends OneBHK{
    float room2Area;

    TwoBHK(float roomArea,float hallArea,double price,float room2Area){
        super(roomArea,hallArea,price);
        this.room2Area= room2Area;

    }

    void show(){
        super.show();
        System.out.println("Room2Area :"+room2Area);
    }


}
