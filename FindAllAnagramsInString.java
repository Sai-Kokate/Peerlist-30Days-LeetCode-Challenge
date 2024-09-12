import java.util.*;

public class FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        List<Integer> ans = new ArrayList<>();
        if(plen > slen){
            return ans;
        }
        // add the p's characters to a hashmap for each character and its count,
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        
        for(int i=0; i<plen; i++){
            if(hm1.containsKey(p.charAt(i))){
                hm1.put(p.charAt(i), hm1.get(p.charAt(i))+1);
            } else {
                hm1.put(p.charAt(i), 1);
            }

            if(hm2.containsKey(s.charAt(i))){
                hm2.put(s.charAt(i), hm2.get(s.charAt(i))+1);
            } else {
                hm2.put(s.charAt(i), 1);

            }
        }
        // check if initial plen chars are present
        if(hm1.equals(hm2)){
            ans.add(0);
        }
        int left = 0;
        //  i represents right elements
        for(int right=plen; right<slen; right++){
            if(hm2.containsKey(s.charAt(right))){
                hm2.put(s.charAt(right), hm2.get(s.charAt(right))+1);
            } else {
                hm2.put(s.charAt(right), 1);
            }
            hm2.put(s.charAt(left), hm2.get(s.charAt(left))-1);

            if(hm2.get(s.charAt(left))==0){
                // remove the element from hashmap 2
                hm2.remove(s.charAt(left));
            }
            left = left +1 ;
            // compare hashmasps now
            if(hm1.equals(hm2)){
                ans.add(left);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s, p));
    }
}