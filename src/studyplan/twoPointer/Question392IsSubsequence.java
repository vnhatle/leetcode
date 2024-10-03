package studyplan.twoPointer;

public class Question392IsSubsequence {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        int sIndex = 0;
        for (int i = 0; i < tLength; i++) {
            if (sIndex < sLength && s.charAt(sIndex) == t.charAt(i)) {
                sIndex++;
            }
        }

        return sLength == sIndex;
    }
}
