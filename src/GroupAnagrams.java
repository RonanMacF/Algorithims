import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Source: LeetCode Medium Diffuculty
// Problem: Given a list of Strings, group anagrams together
// Assumption: Everything is lowercase
// Complexity: T(N) S(N)
// Additional: 	Another possible solution is the Sort then direct compare
//				Another weird idea, but with possible collisions, is the generate first 26 primes and multiply corresponding character against it.

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Integer, List<String>> map = new HashMap<>();
        for(String w : strs){
            int key = hash(w);          
            map.computeIfAbsent(key, k -> new LinkedList<>()).add(w);
        
        }
        return new ArrayList<>(map.values());
    }
    
    public static int hash(String s){
        int[] a = new int[26];
        for(char c : s.toCharArray()) a[c-'a']++;
        return Arrays.hashCode(a);
    }
}

