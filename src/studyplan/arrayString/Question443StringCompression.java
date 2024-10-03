package studyplan.arrayString;

public class Question443StringCompression {

    public static void main(String[] args) {
        // System.out.println(compress(new char[] { 'a','a','b','b','c','c','c'}));
        System.out.println(compress(new char[] { 'a','b','b','b','b','b','b','b','b','b','b','b','b' }));
    }

    private static int compress(char[] chars) {
        int n = chars.length;
        if (n == 1) {
            return 1;
        }

        int ans = 0;
        int countChars = 1;
        char currentChar = chars[0];
        for (int i = 1; i < n; i++) {
            if (currentChar == chars[i]) {
                countChars++;
            } else {
                chars[ans++] = currentChar;
                for (char digit : String.valueOf(countChars).toCharArray()) {
                    chars[ans++] = digit;
                }
                currentChar = chars[i];
                countChars = 1;
            }

            if (i == n - 1) {
                chars[ans++] = currentChar;
                for (char digit : String.valueOf(countChars).toCharArray()) {
                    chars[ans++] = digit;
                }
            }
        }

        return ans;
    }
}
