public class OneBHK {
    float roomArea;

    float hallArea;
    double price;
    OneBHK(float roomArea,float hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;

    }

    void show(){
        System.out.println("RoomArea :"+ roomArea);
        System.out.println("HallArea :"+hallArea);
        System.out.println("Price :"+price);
    }

}
