import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // create a hashmap 
        HashMap<String, List<String>> hm = new HashMap<>(); 

        // iterate the strings array
        for(String s: strs){
            // convert each string to an array, sort it and turn it back to string
            char charArr[] = s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);

            if(!hm.containsKey(sortedStr)){
                hm.put(sortedStr, new ArrayList<String>());
            }

            // update the list with anagrams
            hm.get(sortedStr).add(s);

        }

        // convert the hm to list
        return (new ArrayList<>(hm.values()));
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}