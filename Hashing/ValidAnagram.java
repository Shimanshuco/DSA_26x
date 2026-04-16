package Repo.DSA_26x.Hashing;
import java.util.HashMap;
//Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
// typically using all the original letters exactly once.
public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c, 0) + 1);
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));

        System.out.println();

        String s1 = "rat";
        String t1 = "car";
        
        System.out.println(isAnagram(s1, t1));
    }
    
}
