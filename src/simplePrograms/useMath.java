package simplePrograms;


class Math {
    static int a = 10;

    static {
        System.out.println("first static block called");

    }

    static int getValue() {
        return a;
    }

    static {
        System.out.println("second static block called");
    }
}

public class useMath {
    public static void main(String[] args) {
        System.out.println("main method called");
        //static method call without creating object of the class
        int value = Math.getValue();
        System.out.println("Static value for other class without create object for that class : " + value);
        Math obj;
        obj = new Math();


    }
}
