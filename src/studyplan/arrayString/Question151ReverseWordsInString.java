package studyplan.arrayString;

import java.util.Stack;

public class Question151ReverseWordsInString {

    public static void main (String [] args) {
        System.out.println(reverseWords(" asdasd df f"));
    }

    private static String reverseWords(String s) {
        Stack<String> words = new Stack<String>();

        int startIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (startIndex == -1) {
                if (s.charAt(i) != ' ') {
                    startIndex = i;
                }
            } else {
                if (s.charAt(i) == ' ') {
                    words.push(s.substring(startIndex, i));
                    startIndex = -1;
                }
            }

            if (startIndex > -1 && i == s.length() - 1) {
                words.push(s.substring(startIndex, i + 1));
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        while(!words.empty()) {
            result.append(words.pop()).append(" ");
        }

        return result.toString();
    }
}
