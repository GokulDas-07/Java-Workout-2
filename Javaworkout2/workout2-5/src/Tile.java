public class Tile {
    int edgeLength;

    Tile(int edgeLength){
        this.edgeLength=edgeLength;
    }

    int Area(){
        int Area= (edgeLength*edgeLength);
        return Area;
    }
}
