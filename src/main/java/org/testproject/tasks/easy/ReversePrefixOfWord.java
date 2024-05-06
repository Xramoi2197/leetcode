/*
2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment
of word that starts at index 0 and ends at the index of the first occurrence
of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment
that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

*/

package org.testproject.tasks.easy;

public class ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        char[] letters = word.toCharArray();
        var index = word.indexOf(ch);
        if (index == -1) return word;
        for (int i = 0; i != index / 2 + 1; i++) {
            char temp = letters[i];
            letters[i] = letters[index - i];
            letters[index - i] = temp;
        }
        return String.copyValueOf(letters);
    }
}
