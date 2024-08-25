import java.util.*;

public class _2_Group_Anagrams {
    // 49 Ground Anagrams Leetcode Question

    // Anagrams are words that have the same characters but in a different order.
    public static void main(String[] args) {
        String[] ans = { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> hi = groupAnagrams(ans);
        System.out.println(hi);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String curr = strs[i];
            char[] currChar = curr.toCharArray();
            Arrays.sort(currChar);
            Arrays.sort(curr.toCharArray());

            String sorted = new String(currChar);
            if (map.containsKey(sorted)) {
                map.get(sorted).add(curr);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(curr);
                map.put(sorted, temp);
            }
        }
        for (String key : map.keySet()) {
            res.add(map.get(key));
        }
        return res;

        /* // another solution
            public static List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            
            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());
        
        }
         */
    }
}
