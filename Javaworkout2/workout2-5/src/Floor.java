public class Floor {
    int length;
    int width;

    Floor(int length,int width){
        this.length=length;
        this.width=width;
    }

    public float totalTiles(Tile t){
        float tileArea=t.Area();
        float floorArea=(length*width);
        float TotalTiles=(floorArea/tileArea);
        return TotalTiles;
    }
}
