import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// Source: LeetCode Medium Diffuculty
// Problem: Given a list of Strings, group anagrams together
// Assumption: Everything is lowercase
// Complexity: T(N) S(NK) N = amount of Strings, K = Longest string 
// Additional: 	Another possible solution is the Sort then direct compare
//				Another weird idea, but with possible collisions, is the generate first 26 primes and multiply corresponding character against it.

public class GroupAnagrams {
	
	public static void main(String[] args) {
		String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(input);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for(String w : strs){
            int key = hash(w);          
            map.computeIfAbsent(key, k -> new LinkedList<>()).add(w);
            System.out.println(Arrays.toString(map.entrySet().toArray()));
        }
        return new ArrayList<>(map.values());
    }
    
    public static int hash(String s){
        int[] a = new int[26];
        for(char c : s.toCharArray()) a[c-'a']++;
        return Arrays.hashCode(a);
    }
}

