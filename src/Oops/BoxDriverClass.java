package Oops;

public class BoxDriverClass {
    public static void main(String[] args) {
        Box b = new Box(10, 20, 30);
        Box b2 = new Box(40);
        Box b3 = new Box();

        b.showBox();
        b2.showBox();
        b3.showBox();


    }
}
