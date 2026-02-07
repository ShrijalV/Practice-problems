package anagram;
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};

        List<List<String>> result = new ArrayList<>();
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    used[j] = true;
                }
            }
            result.add(group);
        }

        System.out.println(result);
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }
}

