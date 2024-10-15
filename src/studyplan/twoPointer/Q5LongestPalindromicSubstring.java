package studyplan.twoPointer;

/**
 * See description here:
 * https://leetcode.com/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=two-pointers&difficulty=EASY%2CMEDIUM
 */
public class Q5LongestPalindromicSubstring {

    public static void main(String [] args) {
        System.out.print(longestPalindrome("babad"));
        System.out.print(longestPalindrome("cbbd"));
    }

    static String longestPalindrome(String s) {
        int len = s.length();
        String longestPalindromic = "";


        for (int i = 0; i < len; i++) {
            int left = i;
            int right = i;

            while(left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longestPalindromic.length()) {
                    longestPalindromic = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        for (int i = 0; i < len; i++) {
            int left = i;
            int right = i + 1;

            while(left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > longestPalindromic.length()) {
                    longestPalindromic = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return longestPalindromic;
    }
}
