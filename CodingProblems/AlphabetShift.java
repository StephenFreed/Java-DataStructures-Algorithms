package CodingProblems;

/*
given a string of lowercase letters and a key to shift those letters over by that amount
return new string
 */

public class AlphabetShift {

    public static String returnShiftedString(String str, int key) {
        // create char[] length of str
        // create alphabet string to index off
        // iterate through length of string getting shifted index of char in alphabet

        char[] answer = new char[str.length()];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {
            int currentIdx = alphabet.indexOf(str.charAt(i));
            int wrappedIdx = (currentIdx + key) % 26;
            answer[i] = alphabet.charAt(wrappedIdx);
        }

        return String.valueOf(answer);
    }

    public static void main(String[] args) {
        String shiftTest = "stu";
        int keyTest = 62;
        System.out.println(returnShiftedString(shiftTest, keyTest));
    }
}
