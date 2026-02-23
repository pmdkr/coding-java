package Oops.polymorphism;

public class DriverLanguage {
    public static void main(String[] args) {


        // without run time polymorphism
//        Hindi h = new Hindi();
//        h.greetings();
//
//        English en = new English();
//        en.greetings();
//
//
//        French f = new French();
//        f.greetings();


        // to achieve the run time polymorphism , we should use same reference to call different method .
        // parent class reference can point to child class object
        // that we are using below:
        Language lan = new Hindi();


        lan.greetings();

        // Changing the Language class ref to child class object
        lan = new English();
        lan.greetings();
        // Changing the Language class ref to child class object

        lan = new French();
        lan.greetings();
    }
}
