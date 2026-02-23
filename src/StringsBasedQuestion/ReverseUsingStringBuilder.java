package StringsBasedQuestion;

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {
        // reverse the string using string buffer ,- Not thead safe

        /**
         *
         * string builder class is used to treat string as mutable
         *
         * but it is not thread safe
         *
         * it is used in spring boot applications*/

        String input = "Developer";

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();

        System.out.println("Original String: " + input);
        System.out.println("reversed string: " + sb);

//        System.out.println(input==sb);
    }
}
