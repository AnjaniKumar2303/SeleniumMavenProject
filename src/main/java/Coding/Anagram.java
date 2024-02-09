package Coding;

import java.util.HashMap;
import java.util.Set;

public class Anagram {

    public boolean checkAnagram(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++) {
            Character c = s1.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for(int j=0; j<s2.length(); j++) {
            Character c = s2.charAt(j);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)-1);
            } else {
                return false;
            }
        }

        Set<Character> s = map.keySet();

        for(Character c : s) {
            if(map.get(c) != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        String s1 = "abcd";
        String s2 = "adcb";

        Anagram a = new Anagram();
        if(a.checkAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Anagram");
        }
    }
}
