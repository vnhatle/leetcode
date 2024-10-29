package studyplan.twoPointer;

// https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY
public class Q125ValidPalindrome {

    public static void main(String [] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
        System.out.println(isPalindrome(".a"));
    }

    static boolean isPalindrome(String s) {
        int MIN_UPPERCASE_CHARACTER = 65;
        int MAX_UPPERCASE_CHARACTER = 90;

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            int leftChar = s.charAt(left);
            if (leftChar >= MIN_UPPERCASE_CHARACTER && leftChar <= MAX_UPPERCASE_CHARACTER) {
                leftChar += 32;
            }

            if (isNonAlphanumericCharacter(leftChar)) {
                left++;
                continue;
            }

            int rightChar = s.charAt(right);
            if (rightChar >= MIN_UPPERCASE_CHARACTER && rightChar <= MAX_UPPERCASE_CHARACTER) {
                rightChar += 32;
            }

            if (isNonAlphanumericCharacter(rightChar)) {
                right--;
                continue;
            }

            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isNonAlphanumericCharacter(int c) {
        int MIN_LOWERCASE_CHARACTER = 97;
        int MAX_LOWERCASE_CHARACTER = 122;

        int MIN_NUMERIC_CHARACTER = 48;
        int MAX_NUMERIC_CHARACTER = 57;

        if (c >= MIN_LOWERCASE_CHARACTER && c <= MAX_LOWERCASE_CHARACTER) {
            return false;
        }

        return c < MIN_NUMERIC_CHARACTER || c > MAX_NUMERIC_CHARACTER;
    }
}
