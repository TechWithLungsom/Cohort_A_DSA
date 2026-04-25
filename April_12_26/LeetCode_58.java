package April_12_26;

public class LeetCode_58 {
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");

        return words[words.length-1].length();
    }
}
