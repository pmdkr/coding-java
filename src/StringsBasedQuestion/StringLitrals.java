package StringsBasedQuestion;

public class StringLitrals {
    public static void main(String[] args){
        /**
         * String are created 3 ways in java
         * 1. using String literals - immutable
         * 2, using String Builder - mutable
         * 3. using String Buffer - mutable
         * */
         // below code 10000 string objects in memory

        String s= "";
        for(int i=0;i<10000;i++){
            s += i;

        }



        // better solution:
        StringBuilder str= new StringBuilder();
        for(int i=0;i<10000;i++){
            str.append(i);
        }
    }
}
