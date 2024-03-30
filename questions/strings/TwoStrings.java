import java.util.*;

public class TwoStrings {
    static String twoString(String s1, String s2) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }

        set1.retainAll(set2);

        if (!set1.isEmpty())
            return "YES";

        return "NO";
    }

    public static void main(String args[]) {
        String s1 = "barbello";
        String s2 = "trapper";
        System.out.println(twoString(s1, s2));
    }
}
