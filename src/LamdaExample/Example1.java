package LamdaExample;

//roll Dice example
@FunctionalInterface
interface DiceRoller {
    int rollDice();

}

public class Example1 {
    public static void main(String[] args) {
        DiceRoller dr = () -> (int) (Math.random() * 6) + 1;

        System.out.println(dr.rollDice());
        System.out.println(dr.rollDice());
        System.out.println(dr.rollDice());

    }

}
