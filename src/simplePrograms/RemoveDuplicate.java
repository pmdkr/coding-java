package simplePrograms;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "Programming";
        HashSet<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            set.add(c);
        }
        for (char c : set) {
            System.out.println(c);
        }

    }
}
