package Oops;

public class Box {
    int length;
    int breadth;
    int height;

    // this used as this chaining,
    Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Box(int side) {
//        this.length = side;

//        this.breadth = side;
//        this.height = side;
        this(side,side,side);
    }

    Box() {
//        this.length = 0;
//        this.breadth = 0;
//        this.height = 0;
        this(0,0,0);
    }


    public void showBox() {
        System.out.println("Box length: " + length + "breadth : " + breadth + " height : " + height);

    }
}
