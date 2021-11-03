/*
return the longest palindromic substring in a string
 */

package Algorithms;

public class LongestPalindromicSubstring {

    public static String longestN3(String string) {

        String answer = "";

        for (int letterIdx = 0; letterIdx < string.length(); letterIdx++) {
            for (int subStringIdx = letterIdx; subStringIdx < string.length(); subStringIdx++) {
                String subString = string.substring(letterIdx,subStringIdx + 1);

                if (answer.length() >= subString.length()) {
                    continue;
                }

                int leftPointer = 0;
                int rightPointer = subString.length() - 1;
                int palCounter = 0;

                while (leftPointer < rightPointer && subString.charAt(leftPointer) == subString.charAt(rightPointer)) {
                    palCounter++;
                    leftPointer++;
                    rightPointer--;
                }
                if (palCounter == Math.floor(subString.length() / 2) && answer.length() < subString.length()) {
                    answer = subString;
                }

            }
        }
        return answer;

    }

    public static String longestN2(String string) {

        String answer = String.valueOf(string.charAt(0));

        for (int stringIdx = 1; stringIdx < string.length(); stringIdx++) {

            int[] evenCase = findPalindrome(string, stringIdx - 1, stringIdx);
            int[] oddCase = findPalindrome(string, stringIdx - 1, stringIdx + 1);

            String evenString = string.substring(evenCase[0],evenCase[1]);
            String oddString = string.substring(oddCase[0],oddCase[1]);
            String maxString = evenString.length() > oddString.length() ? evenString : oddString;

            if (maxString.length() > answer.length()) {
                answer = maxString;
            }
        }
    return answer;
    }

    public static int[] findPalindrome(String string,int leftIdx, int rightIdx) {

        while (leftIdx >= 0 && rightIdx < string.length()) {
            if (string.charAt(leftIdx) != string.charAt(rightIdx)) {
                break;
            }
            leftIdx--;
            rightIdx++;
        }
    return new int[] {leftIdx + 1, rightIdx};
    }

    public static void main(String[] args) {
        System.out.println(longestN3("z234a5abbba54a32z"));
        System.out.println(longestN3("a"));
        System.out.println(longestN3("abcdefedcba"));
        System.out.println("================");
        System.out.println(longestN2("z234a5abbba54a32z"));
        System.out.println(longestN2("a"));
        System.out.println(longestN2("abcdefedcba"));



    }
}
