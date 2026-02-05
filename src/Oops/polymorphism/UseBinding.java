package Oops.polymorphism;

public class UseBinding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent.show();
        p.display();


        // change Parent p refrenace to child object
        p = new Child();
        Parent.show();
        p.display();

    }
}
