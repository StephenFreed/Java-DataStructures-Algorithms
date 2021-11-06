/*
reverse string
 */

package Algorithms;

public class ReverseString {

    private static StringBuffer reversedString(String string) {
        // initialize StringBuffer object
        StringBuffer revString = new StringBuffer();
        // loop through index reversed
        for (int i = string.length() -1; i >= 0; i--) {
            // append char to StringBuffer
            revString.append(string.charAt(i));
        }
        return revString;
    }

    public static void main(String[] args) {
        String revTest = "hgfedcba";
        System.out.println(reversedString(revTest));
    }


}
