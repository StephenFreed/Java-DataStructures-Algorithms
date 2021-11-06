/*
check if string is pangram
pangram contains all characters of the alphabet
 */

package CodingProblems;

public class StringIsPangram {

    private static boolean isPangram(String string) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // uppercase value of ch
            char chUpperCase = Character.toUpperCase(ch);
            // checks if character is in string(upper and lowercase)
            if (string.indexOf(ch) < 0 && string.indexOf(chUpperCase) < 0) {
                return false;
            }
        }
        // if loop makes it through all characters true
        return true;
    }

    public static void main(String[] args) {

        String testOne =  "Pack my box with five dozen liquor jugs."; // should be true
        System.out.println(isPangram(testOne));

        String testTwo =  "Glib jocks quiz nymph to vex dwarf."; // should be true
        System.out.println(isPangram(testTwo));

        String testThree =  "bcd efgHIJk lmnop qrSTU VwxyZ"; // should be false
        System.out.println(isPangram(testThree));

    }
}
